<%-- 
    Document   : Customer-List
    Created on : 30-Nov-2023, 3:40:14 pm
    Author     : abc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<<<<<<<< HEAD:Manager/Customer-List.jsp
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
========
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <title>User-Dashboard</title>
    <meta content="" name="description" />
    <meta content="" name="keywords" />

>>>>>>>> cf5cb20333c273c5ca71f02ec7647db76e06eb39:Uday/Uday/TransactionHistory.html
    <!-- Favicons -->
    <link href="assets/img/logo.png" rel="icon" />
    <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

    <!-- Google Fonts -->
    <link href="https://fonts.gstatic.com" rel="preconnect" />
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
      rel="stylesheet"
    />

    <!-- Vendor CSS Files -->
    <link
      href="assets/vendor/bootstrap/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link
      href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
      rel="stylesheet"
    />
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet" />
    <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet" />
    <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet" />
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet" />
    <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet" />

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet" />
<<<<<<<< HEAD:Manager/Customer-List.jsp
    </head>
    <body>
       <!-- ======= Header ======= -->
    <header id="header" class="header fixed-top d-flex align-items-center">
========

    <!-- link css -->
    <style>
      body {
        font-family: "Lato", sans-serif;
      }

      h1 {
        margin-top: 0px;
        margin-bottom: 5px;
      }

      label {
        color: #333;
      }

      .btn-send {
        font-weight: 300;
        text-transform: uppercase;
        letter-spacing: 0.2em;
        width: 100%;
        margin-left: 3px;
      }
      .help-block.with-errors {
        color: #ff5050;
        margin-top: 5px;
      }

      .card {
        margin-left: 10px;
        margin-right: 10px;
      }
    </style>
  </head>

  <body>
     <!-- ======= Header ======= -->
    <header style="background-color: #861F41" id="header" class="header fixed-top d-flex align-items-center">
>>>>>>>> cf5cb20333c273c5ca71f02ec7647db76e06eb39:Uday/Uday/TransactionHistory.html
      <div class="d-flex align-items-center justify-content-between">
        <a href="index.html" class="logo d-flex align-items-center">
          <img src="assets/img/Logo_New-3.png" alt="" />
          <!-- <span class="d-none d-lg-block">Swastik</span> -->
        </a>
        <i class="bi bi-list toggle-sidebar-btn"></i>
      </div>
      <!-- End Logo -->

      <div class="search-bar">
        <form
          class="search-form d-flex align-items-center"
          method="POST"
          action="#"
        >
          <input
            type="text"
            name="query"
            placeholder="Search"
            title="Enter search keyword"
          />
          <button type="submit" title="Search">
            <i class="bi bi-search"></i>
          </button>
        </form>
      </div>
      <!-- End Search Bar -->

      <nav class="header-nav ms-auto">
        <ul class="d-flex align-items-center">
          <li class="nav-item d-block d-lg-none">
            <a class="nav-link nav-icon search-bar-toggle" href="#">
              <i class="bi bi-search"></i>
            </a>
          </li>
          <!-- End Search Icon-->

          <!-- End Notification Nav -->

          <li class="nav-item dropdown pe-3">
            <a
              class="nav-link nav-profile d-flex align-items-center pe-0"
              href="#"
              data-bs-toggle="dropdown"
            >
              <img
                src="assets/img/messages-3.jpg"
                alt="Profile"
                class="rounded-circle"
              />
              <span class="d-none d-md-block dropdown-toggle ps-2"
                >Uday</span
              > </a
            ><!-- End Profile Iamge Icon -->

            <ul
              class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile"
            >
              <li class="dropdown-header">

                <h6>Uday Mourya</h6>


                <!-- <span>Manager</span> -->
              </li>
              <li>
                <hr class="dropdown-divider" />
              </li>

              <li>
                <a
                  class="dropdown-item d-flex align-items-center"
                  href="users-profile.html"
                >
                  <i class="bi bi-person"></i>
                  <span>Change Password</span>
                </a>
              </li>
              <li>
                <hr class="dropdown-divider" />
              </li>

              <li>
                <hr class="dropdown-divider" />
              </li>

              <li>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <i class="bi bi-box-arrow-right"></i>
                  <span>Sign Out</span>
                </a>
              </li>
            </ul>
            <!-- End Profile Dropdown Items -->
          </li>
          <!-- End Profile Nav -->
        </ul>
      </nav>
      <!-- End Icons Navigation -->
    </header>
    <!-- End Header -->

    <!-- ======= Sidebar ======= -->
    <aside id="sidebar" class="sidebar">
      <ul class="sidebar-nav" id="sidebar-nav">
        <li class="nav-item">
          <a class="nav-link" href="index.html">
            <i class="bi bi-grid"></i>
            <span>Dashboard</span>
          </a>
        </li>
        <!-- End Dashboard Nav -->

        <li class="nav-item">
          <a
            class="nav-link collapsed"
            data-bs-target="#components-nav"
            data-bs-toggle="collapse"
            href="#"
          >
            <i class="bi bi-menu-button-wide"></i><span>Transfer Money</span
            ><i class="bi bi-chevron-down ms-auto"></i>
          </a>
          <ul
            id="components-nav"
            class="nav-content collapse"
            data-bs-parent="#sidebar-nav"
          >
          <li>
            <a href="Addbeneficiary.html">
              <i class="bi bi-circle"></i><span>Add Beneficiary</span>
            </a>
          </li>
            <li>
              <a href="Transfermoney.html">
                <i class="bi bi-circle"></i
                ><span>Transfer Money From Account Number </span>
              </a>
            </li>
           
          </ul>
        </li>
        <!-- End Components Nav -->

        <li class="nav-item">
          <a
            class="nav-link collapsed"
            data-bs-target="#forms-nav"
            data-bs-toggle="collapse"
            href="#"
          >
            <i class="bi bi-journal-text"></i><span>Request</span
            ><i class="bi bi-chevron-down ms-auto"></i>
          </a>
          <ul
            id="forms-nav"
            class="nav-content collapse"
            data-bs-parent="#sidebar-nav"
          >
            <li>
              <a href="documentrequest.html">
                <i class="bi bi-circle"></i><span>Document Update Request</span>
              </a>
            </li>
            <li>
              <a href="loanform2.html">
                <i class="bi bi-circle"></i><span>Loan Apply Request</span>
              </a>
            </li>
            <li>
              <a href="unblock.html">
                <i class="bi bi-circle"></i><span>Unblock Account</span>
              </a>
            </li>
          </ul>
        </li>
        <!-- utility -->
        <li class="nav-item">
          <a
            class="nav-link collapsed"
            data-bs-target="#utility-nav"
            data-bs-toggle="collapse"
            href="#"
          >
            <i class="bi bi-journal-text"></i><span>Utility Service</span
            ><i class="bi bi-chevron-down ms-auto"></i>
          </a>
          <ul
            id="utility-nav"
            class="nav-content collapse"
            data-bs-parent="#sidebar-nav"
          >
            <li>
              <a href="mobilerecharge.html">
                <i class="bi bi-circle"></i><span>Recharge</span>
              </a>
            </li>
            <li>
              <a href="billpayment.html">
                <i class="bi bi-circle"></i><span>Bill & Payment</span>
              </a>
            </li>
            <li>
              <a href="#">
                <i class="bi bi-circle"></i><span>EMI Payment</span>
              </a>
            </li>
          </ul>
        </li>

        <!-- End Forms Nav -->

        <li class="nav-item">
          <a
            class="nav-link collapsed"
            data-bs-target="#tables-nav"
            data-bs-toggle="collapse"
            href="#"
          >
            <i class="bi bi-layout-text-window-reverse"></i
            ><span>Customer Reports</span
            ><i class="bi bi-chevron-down ms-auto"></i>
          </a>
          <ul
            id="tables-nav"
            class="nav-content collapse"
            data-bs-parent="#sidebar-nav"
          >
            <li>
              <a href="civilreport.html">
                <i class="bi bi-circle"></i><span>Civil Report</span>
              </a>
            </li>

            <li>
              <a href="TransactionHistory.html">
                <i class="bi bi-circle"></i><span>Transaction History</span>
              </a>
            </li>
          </ul>
        </li>
        <li class="nav-item">
          <a
            class="nav-link collapsed"
            data-bs-target="#feedback-nav"
            data-bs-toggle="collapse"
            href="#"
          >
            <i class="bi bi-layout-text-window-reverse"></i
            ><span> Feedback</span><i class="bi bi-chevron-down ms-auto"></i>
          </a>
          <ul
            id="feedback-nav"
            class="nav-content collapse"
            data-bs-parent="#sidebar-nav"
          >
            <li>
              <a href="#">
                <i class="bi bi-circle"></i><span>Review & Feedback</span>
              </a>
            </li>
            
            
          </ul>
        </li>

        <li class="nav-heading">Pages</li>

        <!-- End F.A.Q Page Nav -->

        <li class="nav-item">
          <a class="nav-link collapsed" href="swastiksupport.html">
            <i class="bi bi-envelope"></i>
            <span>Contact</span>
          </a>
        </li>
      
        </li>
      </ul>
    </aside>
    <!-- End Sidebar-->
    <main id="main" class="main">
      <div class="pagetitle">
        <nav>
          <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="index.html">Home</a></li>
            <li class="breadcrumb-item">Reports</li>
            <li class="breadcrumb-item active">Transaction History</li>
          </ol>
        </nav>
        <h4>Transaction History</h4>
      </div>
      <!-- End Page Title -->
      <div class="row p-4">
        <div class="col-md-5">
            <input type="date" class="form-control" placeholder="starting date" aria-label="Starting date">
        </div>
        <div class="col-md-5">
            <input type="date" class="form-control" placeholder="current date" aria-label="Current date">
        </div>
        <div class="col-md-2">
            <button type="button" class="btn btn-primary">Search</button>
        </div>
    </div>
    
      <section class="section">
        <table class="table table-striped table-hover border">
          <thead class="bg-light">
          <tr>
            <h4 class="text-center my-3 mb-4">Transaction History</h4>
          </tr>
            <tr>
              <th>Transaction Date</th>
              <th>Transaction ID</th>
              <th>Service</th>
              <th>Ammount</th>
              <th>Status</th>
            </tr>
            
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
          </thead>
        </table>
      </section>
    </main>
    <!-- End #main -->

    <footer id="footer" class="footer">
      <div class="copyright">
        &copy; Copyright <strong><span>SwastikBank</span></strong
        >. All Rights Reserved
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
        Designed by <a href="index.html">Tech Nerds</a>
      </div>
    </footer>
    <!-- End Footer -->

    
    <a
      href="#"
      class="back-to-top d-flex align-items-center justify-content-center"
      ><i class="bi bi-arrow-up-short"></i
    ></a>

    <!-- Vendor JS Files -->
    <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/chart.js/chart.umd.js"></script>
    <script src="assets/vendor/echarts/echarts.min.js"></script>
    <script src="assets/vendor/quill/quill.min.js"></script>
    <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
    <script src="assets/vendor/tinymce/tinymce.min.js"></script>
    <script src="assets/vendor/php-email-form/validate.js"></script>

    <!-- Template Main JS File -->
    <script src="assets/js/main.js"></script>
    </body>
</html>
