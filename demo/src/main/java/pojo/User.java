package pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @NoArgsConstructor: 自动生成无参数构造函数。
 *   @AllArgsConstructor: 自动生成全参数构造函数。
 *  @Data: 自动为所有字段添加@ToString, @EqualsAndHashCode, @Getter方法，为非final字段添加@Setter,和@RequiredArgsConstructor!
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Long id;
    private String reader;
    private String userName;
    private String password;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
