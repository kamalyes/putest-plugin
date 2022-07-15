package com.mryu.putest.plugin.suggestion.completion;

import com.intellij.codeInsight.completion.InsertHandler;
import com.intellij.codeInsight.lookup.LookupElement;
import com.mryu.putest.plugin.suggestion.handler.YamlKeyInsertHandler;
import com.mryu.putest.plugin.suggestion.handler.YamlValueInsertHandler;

public enum FileType {
    /**
     * 暂仅支持yaml
     */
    YAML;

    public InsertHandler<LookupElement> newKeyInsertHandler() {
        switch (this) {
            case YAML:
                return new YamlKeyInsertHandler();
            default:
                return null;
        }
    }

    public InsertHandler<LookupElement> newValueInsertHandler() {
        switch (this) {
            case YAML:
                return new YamlValueInsertHandler();
            default:
                return null;
        }
    }

}
