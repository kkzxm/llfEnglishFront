package com.lingDream.llfEnglish.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingDream.llfEnglish.entity.TagGroup;
import com.lingDream.llfEnglish.mapper.TagGroupMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 酷酷宅小明
 * @CreateTime: 2021-04-21 10:37
 */

@Service
public class TagGroupService extends ServiceImpl<TagGroupMapper, TagGroup> {

    @Override
    public List<TagGroup> list() {
        final List<TagGroup> list = super.list();
        List<TagGroup> rootTagGroup = new ArrayList<>();
        for (TagGroup tagGroup : list) {
            final TagGroup tagGroupParent = tagGroup.getTagGroupParent();
            //如果它没有父级,就说明它是顶级的
            if (tagGroupParent == null) {
                rootTagGroup.add(tagGroup);
            } else {
                //如果它有父级,那就需要去找到它的父级,交将它装到它的父级list中,
                TagGroup parentGroup = getTagGroupById(list, tagGroupParent);
                if (parentGroup != null) {
                    parentGroup.addChild(tagGroup);
                }
            }
        }
        return rootTagGroup;
    }

    private TagGroup getTagGroupById(List<TagGroup> tagGroupList, TagGroup tagGroup) {
        for (TagGroup group : tagGroupList) {
            if (group.equals(tagGroup)) {
                return group;
            }
        }
        return null;
    }
}
