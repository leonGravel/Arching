package com.arching.dao;
import com.arching.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * Created by leebr on 2017/9/19.
 */
@Mapper
public interface userMapper {
    List<User> getUser(int id);
}
