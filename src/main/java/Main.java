import java.util.List;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(getBlocks());

        System.out.println(wall.findBlockByColor("p"));
        System.out.println(wall.findBlockByColor("red"));
        System.out.println(wall.findBlocksByMaterial("c"));
        System.out.println(wall.count());
    }

    private static List<Block> getBlocks() {
        return List.of(
                new BlockImpl("red", "a"),
                new BlockImpl("blue", "b"),
                new BlockImpl("green", "c")
        );
    }
}
