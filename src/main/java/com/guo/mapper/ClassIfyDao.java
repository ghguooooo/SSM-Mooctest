package com.guo.mapper;

import com.guo.domain.Classify;

import java.util.List;

public interface ClassIfyDao {
    public List<Classify>  selectAllClassify() throws Exception;
}
