// Copyright (c) Microsoft. All rights reserved.
package com.microsoft.openai.samples.rag.model;

import com.microsoft.openai.samples.rag.approaches.RetrievalMode;

public record ChatAppRequestOverrides(
        RetrievalMode retrieval_mode,
        boolean semantic_ranker,
        boolean semantic_captions,
        String exclude_category,
        int top,
        float temperature,
        String prompt_template,
        String prompt_template_prefix,
        String prompt_template_suffix,
        boolean suggest_followup_questions,
        boolean use_oid_security_filter,
        boolean use_groups_security_filter,
        float minimum_search_score,
        float minimum_reranker_score) {}
