package gyl.service.service.impl;

import gyl.service.dao.DictionaryDao;
import gyl.service.entity.Dictionary;
import gyl.service.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloud_demo
 * @description: Dictionaryservice实现类
 * @author: gyl
 * @create: 2020-04-13 07:38
 **/
@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryDao dictionaryDao;
    /**
     * 查询数据字典
     *
     * @return
     */
    @Override
    public List<Dictionary> findAllDictionary() {
        return dictionaryDao.findAllDictionary();
    }

    /**
     * 通过id查询dictionary
     *
     * @param id id参数
     * @return dictionary对象
     */
    @Override
    public Dictionary findDictionaryById(int id) {
        return dictionaryDao.findDictionaryById(id);
    }

    /**
     * 通过id删除dictionary
     *
     * @param id 参数id
     */
    @Override
    public void deleteDictionaryById(int id) {
         dictionaryDao.deleteDictionaryById(id);
    }

    /**
     * 添加dictionary
     *
     * @param dictionary 需要添加的dictionary
     */
    @Override
    public void addDictionary(Dictionary dictionary) {
        dictionaryDao.addDictionary(dictionary);
    }

    /**
     * 更新dictionary
     *
     * @param dictionary 需要更新的dictionary
     */
    @Override
    public void updateDictionary(Dictionary dictionary) {
        dictionaryDao.updateDictionary(dictionary);
    }
}
