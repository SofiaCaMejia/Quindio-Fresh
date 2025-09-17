package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Cliente cliente = new Cliente("Juan Pérez", "JuanPerez@gmail.com", "30983776476");

        Pedido pedido1 = new Pedido.Builder("P001", cliente)
                .agregarItemPedido(new Producto("P001", "Juan Pérez" , 3 ))
                .direccionEnvio("Calle 123")
                .notas("Dejar en portería")
                .codigoDescuento("DESC10")
                .envio(new EnvioEstandar())
                .build();

        Pedido pedido2 = new Pedido.Builder("P001", cliente)
                .agregarItemPedido(new Producto("P001", "Juan Pérez" , 3 ))
                .direccionEnvio("Calle 123")
                .notas("Dejar en portería")
                .codigoDescuento("DESC10")
                .envio(new EnvioExpress())
                .build();

        System.out.println(pedido1);
        pedido1.procesarEnvio();
    }
}