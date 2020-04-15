package gyl.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @program: springcloud_demo
 * @description: 字典实体类
 * @author: gyl
 * @create: 2020-04-13 06:53
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dictionary {
    private int dicId;
    private String value;
    private String remark;
    private String status;
    private String orgId;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
    private String version;
    private int typeId;
    private DictionaryType dictionaryType;


}
