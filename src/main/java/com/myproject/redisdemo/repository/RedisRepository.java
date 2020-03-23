package com.myproject.redisdemo.repository;

import com.myproject.redisdemo.model.Game;

import java.util.Map;

public interface RedisRepository {

    Map<Object, Object> findAllGames();

    void add(Game game);

    void delete(String id);

    Game findGame(String id);
}
