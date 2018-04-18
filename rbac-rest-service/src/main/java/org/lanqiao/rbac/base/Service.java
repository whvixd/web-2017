package org.lanqiao.rbac.base;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 层 基础接口，其他Service 接口 请继承该接口
 */
public interface Service<T> {
  void save(T model);//持久化

  void save(List<T> models);//批量持久化

  void deleteById(Integer id);//通过主鍵刪除

  void deleteByIds(String ids);//批量刪除 eg：ids -> “1,2,3,4”

  void update(T model);//更新

  T findById(Integer id);//通过ID查找

  T findBy(String property, Object value) throws TooManyResultsException; //通过某个成员属性查找,value需符合unique约束

  List<T> findByIds(String ids);//通过多个ID查找//eg：ids -> “1,2,3,4”

  List<T> findByCondition(Condition condition);//根据条件查找

  List<T> findAll();//获取所有

  int count();// get records count of the whole table

  /**
   *
   * @param pageNumber 页码
   * @param pageSize 每页提取记录数
   * @return
   */
  PageInfo findAll(Integer pageNumber, Integer pageSize);// paging select
}
