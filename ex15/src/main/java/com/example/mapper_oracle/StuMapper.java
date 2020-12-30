package com.example.mapper_oracle;

import java.util.List;

import com.example.domain.Criteria;
import com.example.domain.StuVO;

public interface StuMapper {
	public List<StuVO> list(Criteria cri);
	
}
