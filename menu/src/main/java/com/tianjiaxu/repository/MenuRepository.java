package com.tianjiaxu.repository;

import com.tianjiaxu.entity.Menu;

import java.util.List;

public interface MenuRepository  {

    public List<Menu> findAll();

    public int count();

    public Menu findById(int id);

    public void save(Menu menu);

    public void update(Menu menu);

    public void deleteById(int id);
}
