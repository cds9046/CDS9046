package com.example.mapper_oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface GraphMapper {
	//���º� �������
	public List<HashMap<String, Object>> cavg();
	//�л��� �������
	public List<HashMap<String, Object>> savg();
	//�а��� �л���
	public List<HashMap<String, Object>> dcount();
}
