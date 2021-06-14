package examples.withkapt;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.Nullable;

@Getter @Setter @ToString
public class SomePojo {

    @NonNull
    private String name;
    private int age;

}
