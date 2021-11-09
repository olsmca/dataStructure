package dataStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class URL implements Comparable<URL>{

    String url;

    @Override
    public int compareTo(URL url) {
        return this.url.compareTo(url.url);
    }
}
