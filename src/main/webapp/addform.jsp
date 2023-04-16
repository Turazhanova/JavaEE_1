<form action="/add-task" method="post">
    <div class="row">
        <div class="col-12">
            <label>NAME: </label>
        </div>
    </div>
    <div class="row mt-2">
        <div class="col-12">
            <label>
                <input type="text" class="form-control" name="task_name">
            </label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-12">
            <label>DESCRIPTION: </label>
        </div>
    </div>
    <div class="row mt-2">
        <div class="col-12">
            <label>
                <textarea name="task_description" class="form-control" rows="5"></textarea>
            </label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-12">
            <label>DEADLINE: </label>
        </div>
    </div>
    <div class="row mt-2">
        <div class="col-12">
            <label>
                <input type="date" class="form-control" name="task_deadline">
            </label>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-12">
            <button class="btn btn-success">ADD TASK</button>
        </div>
    </div>
</form>