package com.jwt.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jwt.main.sessionBeans.News;

@Repository
public class NewsDao implements INewsDao{

	@Override
	public List<News> ds() {
		List<News> ds = new ArrayList<>();
		for(int i =0;i < 4;i++) {
			News tt = new News();
			tt.setAuthor("tác giả: "+i);
			tt.setContent("nội dung: "+i);
			tt.setTitle("tiêu đề: "+i);
			ds.add(tt);
		}
		return ds;
	}

}
