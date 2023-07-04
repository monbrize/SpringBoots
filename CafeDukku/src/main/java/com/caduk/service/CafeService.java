package com.caduk.service;

import java.util.List;

import com.caduk.domain.CafeVO;

public interface CafeService {

	int createCafe(CafeVO vo);
	int updateCafe(CafeVO vo);
	int deleteCafe(int cafeid);
	CafeVO viewCafe(int cafeid);
	CafeVO viewMyCafe(int idx);
	List<CafeVO> getSearchCafe(String key);
	List<CafeVO> getAllCafe();
	List<CafeVO> getCafebyTag(String tag);
	int updateOwner(int idx);
	
	//cafeid, tag_type, tag_name
	int addImg(CafeVO vo);
	List<CafeVO> cafeImg(int cafeid);
	int removeImg(int imgid);

	int addTag(CafeVO vo);
	List<CafeVO> cafeTag(int cafeid);
	int removeTag(CafeVO vo);
	CafeVO cafeImgbyId(int imgid);
	
}
