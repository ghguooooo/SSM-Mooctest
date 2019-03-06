package com.guo.mapper;

import com.guo.domain.Operation;

import java.util.List;

public interface OperationDao {
    public List<Operation>  selectOperationsByUsername(String username) throws Exception;
}
