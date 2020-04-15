package gyl.service.service;

import gyl.service.entity.Dictionary;

import java.util.List;

/**
 * @program: springcloud_demo
 * @description: dictionaryService接口类
 * @author: gyl
 * @create: 2020-04-13 07:37
 **/
public interface DictionaryService {
    /**
     * 查询数据字典
     * @return
     */
    List<Dictionary> findAllDictionary();

    /**
     * 通过id查询dictionary
     * @param id id参数
     * @return dictionary对象
     */
    Dictionary findDictionaryById(int id);

    /**
     * 通过id删除dictionary
     * @param id 参数id
     */
    void deleteDictionaryById(int id);

    /**
     * 添加dictionary
     * @param dictionary 需要添加的dictionary
     */
    void addDictionary(Dictionary dictionary);

    /**
     * 更新dictionary
     * @param dictionary 需要更新的dictionary
     */
    void updateDictionary(Dictionary dictionary);
}
