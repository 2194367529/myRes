package gyl.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: springcloud_demo
 * @description: 字典数据类型实体类
 * @author: gyl
 * @create: 2020-04-13 07:02
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DictionaryType {
    private int typeId;
    private String type;
    private String description;
}
