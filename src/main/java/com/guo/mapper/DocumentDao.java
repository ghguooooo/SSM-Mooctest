package com.guo.mapper;

import com.guo.domain.Document;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DocumentDao {
    @Select("select * from document")
    public List<Document> selectAllDocument() throws Exception;

    @Delete("delete from document where id = #{id}")
    public void deleteDocumentById(Integer id) throws Exception;
}
