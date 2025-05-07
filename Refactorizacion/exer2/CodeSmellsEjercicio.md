# UD04 - Tarea 3 - Refactorización ajedrez

## Explicación dos "Code Smell" do proxecto orixinal

1. **Long Method**  
   Método demasiado largo que realiza muchas tareas.

1. **Duplicate Code within Class**  
   Código repetido dentro de la misma clase.

1. **Duplicate Code within Method**  
   Fragmentos de código repetidos dentro de un mismo método.

1. **Duplicate Code across Classes**  
   Mismo código presente en varias clases.

1. **Magic Number**  
   Números usados directamente en el código sin contexto.

1. **Feature Envy (2 instances)**  
   Un método accede frecuentemente a los datos de otro objeto.

1. **Improper Naming**  
   Uso de nombres poco claros o engañosos en variables, métodos o clases.

1. **Dead Code**  
   Código que nunca se ejecuta o que ya no se utiliza.

1. **Lazy Class**  
   Clase con muy poca funcionalidad que no justifica su existencia.

1. **Switch Case**  
   Uso repetido de estructuras `switch` o `if-else`.

1. **Indecent Exposure**  
   Cuando una clase expone demasiados detalles internos mediante atributos o métodos públicos.

1. **Collapse Hierarchy (Lazy Class)**  
   La  jerarquía de clases se vuelve innecesariamente compleja.

1. **Long Parameter List**  
   Métodos con demasiados parámetros.

## Explicacións dos FIXME

- Se eliminó código duplicado en métodos de la misma clase al llamar al método isEmpty.
```java
//Fixed Duplicate Code across methods of same class Code-Smell by calling isEmpty method
public Piece getPiece(Position position)
{
   return isEmpty(position) ? null : getCell(position).getPiece();
}
```
- Se pasa el objeto en sí en lugar de sus datos.

```java
//Fixed long parameter list code smell: Pass the object itself instead of passing its data.
// (isValidMove, movePiece, updateIsKingDead, updatePawnStatus)
public boolean isValidMove(Position from, Position to)
{
   return !from.equals(to)
         && !(isPositionOutOfBounds(from) || isPositionOutOfBounds(to))
         && !isEmpty(from)
         && (isEmpty(to) || getPiece(from).getColor() != getPiece(to).getColor())
         && getPiece(from).isValidMove(from, to)
         && hasNoPieceInPath(from, to)
         && (!(getPiece(from) instanceof Pawn) || isValidPawnMove(from, to));
}
```

 - Se elimina la clase Move por su escasa funcionalidad.

```java
//Fixed Lazy-class Code Smell by removing MoveUtil class
    public void makeMove(Position from, Position to)
    {
        _chessBoard.movePiece(from, to);
        System.out.println("Piece moved for Player : " + _currentPlayer);
        System.out.println("");
        System.out.println(_chessBoard);
        if (_chessBoard.isKingDead()) {
            endGame();
            initGame();
        } else {
            _currentPlayer = getOtherPlayer();
        }
    }
```
 - Corrige el acceso del atributo Color.
 - Utiliza el polimorfismo para simplificar el código.

```java
public abstract class Piece
{
    private Color _color; //Fixed Indecent Exposure Code Smell by making field private

    public Piece(Color color)
    {
        _color = color;
    }

    public Color getColor()
    {
        return _color;
    }

    //Fixed Switch-case code smell through polymorphism. Note that type field has also been removed.
    public abstract boolean isValidMove(Position from, Position to);
}

```

 - Utiliza el método abstracto de la clase **"Piece"** para aplicar el polimorfismo.

```java
//Fixed Collapsing Hierarchy (another instance of lazy-class)
public class Bishop extends Piece
{

    public Bishop(Color color)
    {
        super(color);
    }

    @Override
    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isDiagonalMove(from, to);
    }

    @Override
    public String toString()
    {
        return "b";
    }
}
```
