package com.lingDream.llfEnglish.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingDream.llfEnglish.entity.Word;
import com.lingDream.llfEnglish.mapper.WordMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 酷酷宅小明
 * @CreateTime: 2021-07-28 13:59
 */
@Service
public class WordService extends ServiceImpl<WordMapper, Word> {

    public List<Word> getWordByTagId(String tagId) {
        if ("".equals(tagId)) {
            return baseMapper.getWordAllInfoByTagIsNull();
        } else {
            return baseMapper.getWordAllInfoByTagId(tagId);
        }
    }
}
