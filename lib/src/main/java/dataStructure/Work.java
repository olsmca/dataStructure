package dataStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Work implements Comparable<Work>{

    private String title;
    private String author;
    private boolean print;

    @Override
    public int compareTo(Work work) {
        return this.title.compareTo(work.title);
    }
}
