package com.qianyue.first;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

import java.nio.charset.StandardCharsets;

public class HelloAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Project project = e.getProject();
        Messages.showMessageDialog(project, new String("哈喽".getBytes(), StandardCharsets.UTF_8), "Greeting", Messages.getInformationIcon());
    }
}
