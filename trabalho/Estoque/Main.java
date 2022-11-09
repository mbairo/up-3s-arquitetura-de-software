import builder.ConstrutorDePedido;
import model.Pedido;

public class Main {
    public static void main(String[] args) {
        // Mesma coisa que >>> Pedido pedido = new ConstrutorDePedido().setNumeroPedido("1123542134").setMatriz("MatrizCTBA").setFilial("FilialSC").setProduto("Celular", "Xiaomi - Poco x3", 200).builder();
        Pedido pedido = new ConstrutorDePedido ()
            .setNumeroPedido("1123542134")
            .setMatriz("CTBA - Centro")
            .setFilial("SC - Florianópolis")
            .setProduto("Celular", "Xiaomi - Poco x3", 200)
            .setProduto("Televisão", "LG - 55 polegadas", 100)
            .builder();
        System.out.println(pedido);
    }
}