import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Structure {
    // Zwraca dowolny element o podanym kolorze
    Optional<Block> findBlockByColor(String color);
    // Zwraca wszystkie elementy z danego materiału
    List<Block> findBlocksByMaterial(String material);
    // Zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
class Wall implements Structure {
    private List<Block> blocks;
    @Override
    public Optional<Block> findBlockByColor(String color) {
        return getAllBlocks()
                .filter(b -> b.getColor().equals(color))
                .findAny();
    }
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return getAllBlocks()
                .filter(b -> b.getMaterial().equals(material))
                .collect(Collectors.toList());
    }
    @Override
    public int count() {
        return (int)(getAllBlocks().count());
    }

    private Stream<Block> getAllBlocks() {
        return blocks.stream()
                .flatMap(this::flatten);
    }


    private Stream<Block> flatten(Block block) {
        if (block instanceof CompositeBlock) {
            return Stream.concat(
                    Stream.of(block),
                    ((CompositeBlock) block).getBlocks().stream().flatMap(this::flatten));
        }

        return Stream.of(block);
    }


}
interface Block {
    String getColor();
    String getMaterial();
}
interface CompositeBlock extends Block {
    List<Block> getBlocks();
}

public class Zad11 {



}
