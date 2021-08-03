package com.lingDream.llfEnglish.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lingDream.llfEnglish.entity.WordTag;
import com.lingDream.llfEnglish.tool.result.Result;
import com.lingDream.llfEnglish.tool.result.ResultCode;
import com.lingDream.llfEnglish.tool.root.ThereController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 酷酷宅小明
 * @CreateTime: 2021-04-21 10:37
 */
@RestController
@Controller
@RequestMapping(value = "/wordTag")
public class WordTagController extends ThereController<WordTag> {

    public WordTagController(IService<WordTag> service) {
        super(service, "单词标签");
    }

    @GetMapping("/getTagByGroupId")
    public Result getTagByGroupId(String groupId) {
        final List<WordTag> list = service.list(new QueryWrapper<WordTag>()
                .eq("tag_group_id", groupId));
        return new Result(ResultCode.SUCCESS, list);
    }
}
