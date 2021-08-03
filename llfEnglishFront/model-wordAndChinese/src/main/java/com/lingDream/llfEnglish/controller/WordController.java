package com.lingDream.llfEnglish.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lingDream.llfEnglish.entity.Word;
import com.lingDream.llfEnglish.service.WordService;
import com.lingDream.llfEnglish.tool.result.Result;
import com.lingDream.llfEnglish.tool.root.ThereController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.lingDream.llfEnglish.tool.result.ResultCode.SUCCESS;


/**
 * @Author: 酷酷宅小明
 * @CreateTime: 2021-07-28 13:58
 */
@RestController
@Controller
@RequestMapping("/word")
public class WordController extends ThereController<Word> {
    public WordController(IService<Word> service) {
        super(service, "英语单词");
    }

    @GetMapping("/getWordByTagId")
    public Result getWordByTagId(String tagId) {
        final WordService service = (WordService) this.service;
        return new Result(SUCCESS, service.getWordByTagId(tagId));
    }
}
