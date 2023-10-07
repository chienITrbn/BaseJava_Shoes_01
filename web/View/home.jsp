<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-xl-3 col-lg-4 col-md-5">
            <div class="sidebar-categories">
                <div class="head">Browse Categories</div>
                <ul class="main-categories">
                    <li class="main-nav-list"><a data-toggle="collapse" href="<%=request.getContextPath()%>/#fruitsVegetable" aria-expanded="false" aria-controls="fruitsVegetable"><span
                                class="lnr lnr-arrow-right"></span>Fruits and Vegetables<span class="number">(53)</span></a>
                        <ul class="collapse" id="fruitsVegetable" data-toggle="collapse" aria-expanded="false" aria-controls="fruitsVegetable">
                            <li class="main-nav-list child"><a href="<%=request.getContextPath()%>/#">Frozen Fish<span class="number">(13)</span></a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div class="sidebar-filter mt-50">
                <div class="top-filter-head">Product Filters</div>
                <div class="common-filter">
                    <div class="head">Brands</div>
                    <form action="#">
                        <ul>
                            <li class="filter-list"><input class="pixel-radio" type="radio" id="apple" name="brand"><label for="apple">Apple<span>(29)</span></label></li>
                        </ul>
                    </form>
                </div>
                <div class="common-filter">
                    <div class="head">Price</div>
                    <div class="price-range-area">
                        <div id="price-range"></div>
                        <div class="value-wrapper d-flex">
                            <div class="price">Price:</div>
                            <span>$</span>
                            <div id="lower-value"></div>
                            <div class="to">to</div>
                            <span>$</span>
                            <div id="upper-value"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xl-9 col-lg-8 col-md-7">
            <!-- Start Filter Bar -->
            <div class="filter-bar d-flex flex-wrap align-items-center">
                <div class="sorting">
                    <select>
                        <option value="1">Default sorting</option>
                        <option value="1">Default sorting</option>
                        <option value="1">Default sorting</option>
                    </select>
                </div>
                <div class="sorting mr-auto">
                    <select>
                        <option value="1">Show 12</option>
                        <option value="1">Show 12</option>
                        <option value="1">Show 12</option>
                    </select>
                </div>
                <div class="pagination">
                    <a href="<%=request.getContextPath()%>/#" class="prev-arrow"><i class="fa fa-long-arrow-left" aria-hidden="true"></i></a>
                    <a href="<%=request.getContextPath()%>/#" class="active">1</a>
                    <a href="<%=request.getContextPath()%>/#">2</a>
                    <a href="<%=request.getContextPath()%>/#">3</a>
                    <a href="<%=request.getContextPath()%>/#" class="dot-dot"><i class="fa fa-ellipsis-h" aria-hidden="true"></i></a>
                    <a href="<%=request.getContextPath()%>/#">6</a>
                    <a href="<%=request.getContextPath()%>/#" class="next-arrow"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
                </div>
            </div>
            <!-- End Filter Bar -->
            <!-- Start Product List Here -->
            <section class="lattest-product-area pb-40 category-list">
                <div class="row">
                    <!-- single product -->
                    <c:forEach var="product" items="${requestScope.lProduct}">
                        <div class="col-lg-4 col-md-6">
                            <div class="single-product">
                                <a href="<%=request.getContextPath()%>/ProductDetailController?id=${product.id}"><img class="img-fluid" src="${product.image}" alt=""></a>
                                <div class="product-details">
                                    <h6>${product.name}</h6>
                                    <div class="price">
                                        <h6>${product.price}</h6>
                                    </div>
                                    <div class="prd-bottom">

                                        <a href="" class="social-info">
                                            <span class="ti-bag"></span>
                                            <p class="hover-text">add to bag</p>
                                        </a>
                                        <a href="" class="social-info">
                                            <span class="lnr lnr-heart"></span>
                                            <p class="hover-text">Wishlist</p>
                                        </a>
                                        <a href="" class="social-info">
                                            <span class="lnr lnr-sync"></span>
                                            <p class="hover-text">compare</p>
                                        </a>
                                        <a href="" class="social-info">
                                            <span class="lnr lnr-move"></span>
                                            <p class="hover-text">view more</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </section>
            <!-- End Product List Here -->
        </div>
    </div>
</div>
<!-- Start related-product Area -->
<section class="related-product-area section_gap">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6 text-center">
                <div class="section-title">
                    <h1>Deals of the Week</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore
                        magna aliqua.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-9">
                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-6 mb-20">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r1.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6 mb-20">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r2.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6 mb-20">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r3.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6 mb-20">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r5.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6 mb-20">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r6.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6 mb-20">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r7.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r9.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r10.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="single-related-product d-flex">
                            <a href="<%=request.getContextPath()%>/#"><img src="img/r11.jpg" alt=""></a>
                            <div class="desc">
                                <a href="<%=request.getContextPath()%>/#" class="title">Black lace Heels</a>
                                <div class="price">
                                    <h6>$189.00</h6>
                                    <h6 class="l-through">$210.00</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-3">
                <div class="ctg-right">
                    <a href="<%=request.getContextPath()%>/#" target="_blank">
                        <img class="img-fluid d-block mx-auto" src="img/category/c5.jpg" alt="">
                    </a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End related-product Area -->
<%@include file="footer.jsp" %>
