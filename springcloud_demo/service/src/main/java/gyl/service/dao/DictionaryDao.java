package gyl.service.dao;

import gyl.service.entity.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: springcloud_demo
 * @description: DictionaryDao接口
 * @author: gyl
 * @create: 2020-04-13 07:07
 **/
@Repository
public interface DictionaryDao {
    /**
     * 查询所有数据字典
     * @return 字典列表
     */
    List<Dictionary> findAllDictionary();

    /**
     * 通过id查询数据字典
     * @param id id
     * @return 字典对象
     */
    Dictionary findDictionaryById(int id);
    /**
     * 通过id删除数据字典
     * @param id 参数id
     */
    void deleteDictionaryById(int id);
    /**
     * 添加数据字典
     * @param dictionary 字典对象
     */
    void addDictionary(Dictionary dictionary);
    /**
     * 编辑数据字典
     * @param dictionary 字典对象
     */
    void updateDictionary(Dictionary dictionary);
}
