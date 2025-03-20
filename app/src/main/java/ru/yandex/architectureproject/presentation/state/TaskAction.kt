package ru.yandex.architectureproject.presentation.state

import ru.yandex.architectureproject.data.model.Task

sealed class TaskAction {
    data object LoadingTask : TaskAction()
    data class AddTasks(val task: Task):TaskAction()
    data class UpdateTaskStatus(val taskID: Int, val isCompleted:Boolean): TaskAction()
    data class DeleteTask(val taskID: Int): TaskAction()

   }
