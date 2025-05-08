package co.edu.uniquindio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "estaVacio * " +
                "agregarDato * " +
                "recorrerArbol (Inorden, Postorden, Preorden) * " +
                "existeDato * " +
                "ObtenerPeso * " +
                "obtenerAltura * " +
                "contarHojas * " +
                "imprimirAmplitud * " +
                "eliminarDato * " +
                "obtenerNodoMayor * " +
                "obtenerNodoMenor * " +
                "borrarArbol * ");

        ArbolBinarioABB<Double> arbol = new ArbolBinarioABB<>();
        arbol.agregar(2D);
        arbol.agregar(1D);
        arbol.agregar(3D);
        arbol.agregar(4D);
        arbol.agregar(5D);
        arbol.agregar(6D);
        arbol.agregar(7D);
        arbol.agregar(-1D);
        arbol.agregar(-0.5);
        arbol.agregar(-2D);

        System.out.println(arbol.recorrerInorden());
        System.out.println(arbol.recorrerPreorden());
        System.out.println(arbol.recorrerPostorden());

        arbol.eliminar(2D);

        System.out.println(arbol.recorrerInorden());

        System.out.println(arbol.contarHojas());

        System.out.println(arbol.getPeso());

        System.out.println(arbol.obtenerAltura());

        System.out.println(arbol.obtenerAmplitud());

        System.out.println(arbol.obtenerMayor());

        System.out.println(arbol.obtenerMenor());

       /* arbol.eliminar(6D);

        System.out.println(arbol.recorrerInorden());

        arbol.eliminar(1D);

        System.out.println(arbol.recorrerInorden());

        arbol.eliminar(3D);

        System.out.println(arbol.recorrerInorden());

        arbol.eliminar(7D);

        System.out.println(arbol.recorrerInorden());

        arbol.eliminar(5D);

        System.out.println(arbol.recorrerInorden());

        arbol.eliminar(4D);

        System.out.println(arbol.recorrerInorden());*/
    }
}