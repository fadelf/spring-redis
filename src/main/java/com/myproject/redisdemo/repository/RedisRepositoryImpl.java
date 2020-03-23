package com.myproject.redisdemo.repository;

import com.myproject.redisdemo.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;

@Repository
public class RedisRepositoryImpl implements RedisRepository {
    private static final String KEY = "Game";

    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public RedisRepositoryImpl(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }

    public void add(final Game game) {
        hashOperations.put(KEY, game.getId(), game.getName());
    }

    public void delete(final String id) {
        hashOperations.delete(KEY, id);
    }

    public Game findGame(final String id){
        return (Game) hashOperations.get(KEY, id);
    }

    public Map<Object, Object> findAllGames(){
        return hashOperations.entries(KEY);
    }
}
