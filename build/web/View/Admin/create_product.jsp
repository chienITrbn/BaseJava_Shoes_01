<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
              rel="stylesheet" />
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" />
        <style>
            .container-fluid {
                display: flex;
                justify-content: end !important;
                font-family: fantasy;
            }

            * {
                /* border: 1px solid red !important; */
            }

            .navbar {
                box-shadow: rgba(50, 50, 93, 0.25) 0px 6px 12px -2px, rgba(0, 0, 0, 0.3) 0px 3px 7px -3px;
            }

            .main-dashboard {
                display: flex;
                flex-direction: row;
                width: 100%;
            }

            .position-sticky {
                max-width: 15vw;
                height: 100vh;
                box-shadow: rgba(0, 0, 0, 0.1) 0px 4px 12px;
                padding: 0.5rem;
            }

            .menu-dashboard {
                position: fixed;
                height: 100%;
                padding: 0.5rem;
                box-shadow: rgba(0, 0, 0, 0.1) 0px 4px 12px;
            }

            .main-content {
                /* margin: auto; */
                /* background: red; */
                width: 100%;
                position: relative;
            }
            .product {
                /* background-color: #0ea5e9; */
                position: sticky;
                top: 0;
            }

            .product-table {
                font-family: Nunito,-apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol","Noto Color Emoji";
                font-size: small;
                width: 100%;
                height: 50%;
                border-collapse: collapse;
            }

            .product-table tr:hover {
                background-color: #f0f9ff;
            }

            .product-table th {
                font-family: revert;
                text-align: center;
                color: #fafafa;
                background-color: #0ea5e9;
            }

            .product-table td {
                max-width: 55px;
                overflow: hidden;
                padding-left: 10px;
            }
            .product-table tr,
            th,
            td {
                border: 1px solid #38bdf8;
            }

            .title-content {
                font-family: fantasy;
                font-size: xx-large;
                text-align: center;
            }
            .limited-text {
                white-space: nowrap;
                overflow: hidden;
                text-overflow: ellipsis;
                max-width: 100px;
            }
            .btn.edit {
                border: #1a7915;
                background-color: #1a7915;
            }

            .btn.delete {
                border: #D7654D;
                background-color: #D7654D;
            }

            .action a:hover {
                background-color: #14b8a6;
            }

            .btn-add button {
                font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
                border: #0ea5e9;
                background-color: #0ea5e9;
            }

            .container.product {
                /* background: #14b8a6; */
                /* margin: auto; */
                width: 100%;
                /* height: 75%; */
                /* background: #D7654D; */
                padding: 10px;
                display: flex;
                flex-direction: column;
                /* position: fixed; */
            }

            .paginate {
                display: flex;
                justify-content: end;
            }
            .small-input {
                width: 400px;
            }

            .form-create {
                margin: auto;
                max-width: 75%;
                color: #6a8f96;
                /* background: #0ea5e9; */
            }

            .form-create input, .form-create select, .form-create textarea {
                color: #6a8f96;
            }

            .create {
                border: #6a8f96;
                background: #6a8f96;
            }

            .back {
                border: #9ca3af;
                background: #9ca3af;
            }
        </style>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <div class="container brand">
                        <a class="navbar-brand" href="#">
                            <img src="https://placeholder.pics/svg/150x50/888888/EEE/Logo"
                                 alt="..."
                                 height="36" />
                        </a>
                    </div>
                    <form action="#" class="flex-row-reverse">
                        <input autocomplete="off"
                               type="search"
                               class="form-control rounded"
                               placeholder="Type Here..."
                               style="min-width: 225px" />
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item p-3">
                            <i class="fa-solid fa-user p-1"></i>Sign in
                        </li>
                        <li class="nav-item p-3"><i class="fas fa-gear"></i></li>
                        <li class="nav-item p-3"><i class="far fa-bell"></i></li>
                    </ul>
                </div>
            </nav>
        </header>
        <main class="main-dashboard">
            <nav class="collapse d-lg-block sidebar collapse">
                <div class="position-sticky">
                    <div class="list-group list-group-flush mx-3">
                        <a href="<%=request.getContextPath()%>/DashboardController"
                           class="list-group-item list-group-item-action py-2 ripple">
                            <i class="fas fa-bars-progress"></i><span> Manager Product</span>
                        </a>
                        <a href=""
                           class="list-group-item list-group-item-action py-2 ripple">
                            <i class="far fa-circle-user"></i><span> Manager Account</span>
                        </a>
                        <a href=""
                           class="list-group-item list-group-item-action py-2 ripple"><i class="fas fa-mask"></i><span> Manager Order</span></a>
                    </div>
                </div>
                <div></div>
            </nav>
            <section class="main-content">
                <div class="container">
                    <div class="title-content m-5">
                        <p>Create Product</p>
                    </div>
                </div>
                <div class="form-create pt-5">
                    <form action="<%=request.getContextPath()%>/CreateProductController" method="post">
                        <div class="row row-cols-2">
                            <div class="col m-1 small-input">
                                <label for="Name" class="form-label">Name</label>
                                <input type="text" class="form-control" id="Name" name="name" aria-describedby="emailHelp" />
                                <span class="text-danger"></span>
                            </div>
                            <div class="col m-1 small-input">
                                <label for="Category" class="form-label">Category</label>
                                <select class="form-select" id="cat" name="category_id">
                                    <c:forEach var="cat" items="${requestScope.cats}">
                                        <option value="${cat.id}">${cat.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="col m-1 small-input">
                                <label for="Price" class="form-label">Price</label>
                                <input type="text" class="form-control" id="Price" name="price" />
                                <span class="text-danger"></span>
                            </div>
                            <div class="col m-1 small-input">
                                <label for="Brand" class="form-label">Brand</label>
                                <select class="form-select" id="brand" name="brand_id">
                                    <c:forEach var="brand" items="${requestScope.brands}">
                                        <option value="${brand.id}">${brand.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="col m-1 small-input">
                                <label for="Image" class="form-label">Image</label>
                                <input type="file" class="form-control" id="Image" name="image" />
                            </div>
                        </div>
                        <div class="row row-cols-2">
                            <div class="col-8">
                                <label for="Description" class="form-label">Description</label>
                                <textarea class="form-control" id="Description" name="description" rows="6"></textarea>
                                <span class="text-danger"></span>
                            </div>
                        </div>
                        <div class="button-add">
                            <button type="submit" class="btn create btn-primary mt-3">Create</button>
                            <a href="<%=request.getContextPath()%>/DashboardController" class="btn back btn-primary mt-3">Back</a>
                        </div>
                    </form>
                </div>

            </section>
        </main>
        <footer></footer>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    </body>
</html>