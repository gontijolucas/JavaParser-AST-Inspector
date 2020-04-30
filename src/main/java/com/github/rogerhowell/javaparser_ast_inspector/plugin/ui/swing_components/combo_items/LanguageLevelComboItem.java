package com.github.rogerhowell.javaparser_ast_inspector.plugin.ui.swing_components.combo_items;

import org.jetbrains.annotations.NotNull;

import static com.github.javaparser.ParserConfiguration.LanguageLevel;

public class LanguageLevelComboItem extends CustomComboItem<LanguageLevel> {

    public LanguageLevelComboItem(@NotNull String key, @NotNull LanguageLevel value) {
        super(key, value);
    }


    @Override
    public String toString() {
        return "LanguageLevelComboItem{" +
               "key='" + key + '\'' +
               ", value=" + value +
               '}';
    }

}
