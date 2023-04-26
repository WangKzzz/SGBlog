package com.sangeng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Article;


/**
 * 文章表(Article)表服务接口
 *
 * @author makejava
 * @since 2023-04-26 16:00:19
 */
public interface ArticleService extends IService<Article> {
    public ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}

