(function (document) {
  'use strict';

  sessionStorage.setItem('x-api-key', window.AppConfig.globalServices.apiKeyAp);
  window.codiMovementsGlobalArray = [];
  function updateHTTPPlugin() {
    if (window.AppConfig.native) {
      window.cordovaCells = window.cordovaCells || {};
      window.cordovaCells.Http = {
        get: function (url, params, headers, success, failure) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'get', {
            'url': url,
            'params': params,
            'headers': headers
          });
        },
        post: function (url, params, headers, success, failure, multipart) {
          const requestModel = {
            'url': url,
            'params': params,
            'headers': headers
          };
          if (multipart) {
            requestModel.multipart = multipart;
          }
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'post', requestModel);
        },
        put: function (url, params, headers, success, failure, multipart = {}) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'put', {
            'url': url,
            'params': params,
            'headers': headers,
            'multipart': multipart
          });
        },
        head: function (url, params, headers, success, failure) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'head', {
            'url': url,
            'params': params,
            'headers': headers
          });
        },
        patch: function (url, params, headers, success, failure) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'patch', {
            'url': url,
            'params': params,
            'headers': headers
          });
        },
        delete: function (url, params, headers, success, failure) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'delete', {
            'url': url,
            'params': params,
            'headers': headers
          });
        },
        cleanAllCookies: function (success, failure) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'cleanAllCookies', {});
        },
        sslPinning: function (certificates, success, failure) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'sslPinning', {
            'certificates': certificates
          });
        },
        acceptAllCerts: function (allow, success, failure) {
          window.CellsNativePlugins.pluginManager.execute(success, failure, 'Http', 'acceptAllCerts', {
            'allow': allow
          });
        }
      };
      window.CellsNativePlugins = window.CellsNativePlugins || {};
      window.CellsNativePlugins.Nativesettings = {
        getSetting: function (options, successCallback, errorCallback) {
          window.CellsNativePlugins.pluginManager.execute(successCallback, errorCallback, 'NativeSettings', 'opensetting', options);
        }
      };
    }
  }
  var routes = window.AppConfig.routes;
  var userInfo = function () {
    var params = localStorage.getItem('cells-params');
    try {
      return JSON.parse(params) && JSON.parse(params).userInfo;
    } catch (e) {
      return null;
    }
  }();

  // Checked remind user
  if (!window.AppConfig.nativeBuild && userInfo && userInfo.userId) {
    routes.login = '/';
    routes.welcome = '/welcome';

    // Manage /login url
    if (window.location.href.split('#!/')[1] === 'login') {
      window.location.href = window.location.origin;
    }
  }
  var featureFlag = {
    defaultChangedCallback: function (featureFlagValue) {
      this.hidden = !featureFlagValue;
      return !!featureFlagValue;
    }
  };
  window.CellsPolymer.start({
    avoidPolymerEventCache: true,
    mainNode: window.AppConfig.mainNode,
    featureFlag: featureFlag,
    binding: 'ui',
    initialTemplate: window.AppConfig.native ? 'loading' : 'login',
    cache: window.AppConfig.cache,
    debug: window.AppConfig.debug,
    fullProgressiveTransition: window.AppConfig.fullProgressiveTransition,
    prplLevel: window.AppConfig.prplLevel,
    preCache: window.AppConfig.preCache,
    preRender: window.AppConfig.preRender,
    componentsPath: window.AppConfig.componentsPath,
    nativeNamespace: 'NativeBridge',
    onNativeBackStepRequest: function beforeBackStep(backNavigation) {
      const srcPage = backNavigation.currentPage;
      const preventBackNavigationPages = ['account', 'accountEditAlias', 'accountMonthlyStatement', 'accountTransactionDetail', 'additionalCardDetail', 'advancePayments', 'adviceConfiguration', 'applicationFeedback', 'appPermissions', 'atmLocator', 'cardCreditCardPayment', 'cardDetail', 'cardEditAlias', 'cardlessWithdrawal', 'cardlessWithdrawalReview', 'cardMonthlyStatement', 'cardOriginationOcDebitCardInmediateDelivery', 'cardWithoutData', 'carLoan', 'cardTransactionDetail', 'cashZonePaymentsMpos', 'checksManagement', 'checksManagementAddCheck', 'clarificationsManagementCarePage', 'cleanCardOperations', 'codiBeginRegister', 'codicelAgreeAndRemoveConsent', 'codicelPeerToPeerSend', 'codicelPeerToPeerTransferReview', 'codiPaymentRequestMain', 'codiQrRequestSteps', 'codiQrRequestSuccessfulScreen', 'codiQrScanner', 'codiRegister', 'codiTransactionHistory', 'configureProductsPage', 'creditBureau', 'dashboard', 'digitalButler', 'disabilityVideocallHearingTacticalCalling', 'discreetModeSettings', 'dynamicsAndRewards', 'emergencyCraneReports', 'emergencyReports', 'equity', 'equityContractsContribution', 'equityContractsInvestmentDetail', 'equityContractsOperationsReview', 'equityContractsWithdrawal', 'expensesGroup', 'facialRecognition', 'fatcaValidationSurvey', 'feedback', 'filteredPoints', 'financeDebitLineCancel', 'financeTransactionMultipurchase', 'financeTransactionMultipurchaseDebit', 'financeTransactionMultipurchaseDebitPostHiring', 'financingPurchase', 'fundEditAlias', 'goals', 'historyCreditReceipt', 'inAppCrmAdvancedPage', 'inAppCrmPage', 'internationalTransfersCreateRecipientPage', 'internationalTransfersPage', 'internationalTransfersReviewRecipientPage', 'investmentsFollowUp', 'investmentsFollowUpDistribution', 'keyRecovery', 'loanEditAlias', 'loanPayment', 'loanSustainableRateSimulator', 'mixCreditCardAndLoan', 'mobilePayment', 'mobileTopUp', 'mobileTopUpReview', 'monthlyStatementEnquiry', 'mortgage', 'mortgageCertificateCancellationSuccess', 'mortgageCertificateReview', 'mortgagePayment', 'mortgageReview', 'mtuException', 'myConversationChatPage', 'nationalIdAndVideoselfie', 'notificationsCenter', 'ocAccount', 'ocAccountYoung', 'ocCarLoanAccountSelectionSuccess', 'ocCarLoanContractSigning', 'ocCarLoanContractSigningSuccess', 'ocCarLoanRequestDetails', 'ocCarLoanTracking', 'ocCashZone', 'ocLoanRelocation', 'ocPaymentPlanCardErrorPage', 'ocPaymentPlanCardSuccessPage', 'ocPaymentPlanFixedPage', 'ocPaymentPlanRestructurePage', 'ocSupportFixedPaymentsPage', 'ocTopCreditCard', 'operationalLimits', 'pfmCategorization', 'paymentsThirdPartyWalletProvisioning', 'pfmDashboardCheckUp', 'pfmDashboardDetail', 'pfmTransactionsDetail', 'profile', 'promotionsAdvancedPayments', 'qrReader', 'requestDebitCard', 'requestDebitCardSuccess', 'requestMoney', 'reward', 'selfDrivenRoundUp', 'stEnrollment', 'stEnrollmentSuccess', 'storesMap', 'suspectedTransactionDirectDebits', 'sustainability', 'transfers', 'transfersSuccess', 'updateEmailPage', 'updateNationalIdSuccess', 'upgradeAccountCustomerDataPage', 'upgradeAccountInitPage', 'upgradeAccountPrevQuestionsPage', 'upgradeAccountReviewPage', 'userTransactionAmountConfirmation', 'userTransactionAmountDetailNotification', 'userTransactionAmountError', 'userTransactionAmountPendingConfirmation', 'userTransactionAmountRejection', 'validatedEmailSuccess', 'validateEmailPage', 'codiPaymentRequestMain', 'codiQrRequestSteps', 'codiTransactionHistory', 'bbvaTraderProductDetail', 'bbvaTraderPurchaseSale', 'payByBank'];
      const canContinue = !preventBackNavigationPages.includes(srcPage);
      return {
        continue: canContinue
      };
    },
    generateRequestUrl: function generateRequestUrl(page) {
      return window.AppConfig.composerEndpoint + page + '.json';
    },
    routes: routes,
    interceptor: function (navigation) {
      const {
        to: {
          page
        }
      } = navigation;
      let redirect;
      let intercept = false;
      if (/^cashZonePaymentsMpos(Calc|Dash)$/.test(page)) {
        intercept = true;
        redirect = {
          page: 'cashZonePaymentsMpos',
          params: {
            viewMode: page === 'cashZonePaymentsMposCalc' ? 'calculator' : 'dashboard'
          }
        };
      }
      return {
        intercept,
        redirect
      };
    },
    skipNavigations: [{
      from: 'aboutPage',
      to: 'loading'
    }, {
      from: 'accountCreditCardPayment',
      to: 'operations'
    }, {
      from: 'accountEditAlias',
      to: 'operations'
    }, {
      from: 'additionalCardDetail',
      to: 'dashboard'
    }, {
      from: 'atmLocator',
      to: 'loading'
    }, {
      from: 'billPayments',
      to: 'operations'
    }, {
      from: 'blackhawkPurchaseReview',
      to: 'blackhawkPurchase'
    }, {
      from: 'blockAndReplacement',
      to: 'operations'
    }, {
      from: 'cardCreditCardPayment',
      to: 'interestSimulator'
    }, {
      from: 'cardCreditCardPayment',
      to: 'operations'
    }, {
      from: 'cardEditAlias',
      to: 'operations'
    }, {
      from: 'cardGenerateVirtualReview',
      to: 'cardGenerateVirtual'
    }, {
      from: 'cardlessWithdrawal',
      to: 'operations'
    }, {
      from: 'cardlessWithdrawalReview',
      to: 'cardlessWithdrawal'
    }, {
      from: 'cardOriginationOcDebitCardInmediateDelivery',
      to: 'operations'
    }, {
      from: 'cardWithoutData',
      to: 'loading'
    }, {
      from: 'carLoanSuccessPage',
      to: 'carLoan'
    }, {
      from: 'cashZonePaymentsMpos',
      to: 'cashZonePaymentsMposCalc'
    }, {
      from: 'cashZonePaymentsMpos',
      to: 'cashZonePaymentsMposDash'
    }, {
      from: 'cashZonePaymentsMposCalc',
      to: 'loading'
    }, {
      from: 'cashZonePaymentsMposDash',
      to: 'loading'
    }, {
      from: 'checksManagement',
      to: 'checksManagementServiceTermsReview'
    }, {
      from: 'checksManagementReview',
      to: 'checksManagement'
    }, {
      from: 'checksManagementServiceTermsReview',
      to: 'checksManagementServiceTerms'
    }, {
      from: 'checksSection',
      to: 'operations'
    }, {
      from: 'cleanCardOperations',
      to: 'operations'
    }, {
      from: 'codicelAgreeAndRemoveConsent',
      to: 'codicelPeerToPeerTransferReview'
    }, {
      from: 'codicelAgreeAndRemoveConsent',
      to: 'operations'
    }, {
      from: 'codicelPeerToPeerSend',
      to: 'operations'
    }, {
      from: 'codicelPeerToPeerTransferReview',
      to: 'codicelPeerToPeerSend'
    }, {
      from: 'codiEnrollment',
      to: 'codiBeginRegister'
    }, {
      from: 'comingSoon',
      to: 'operations'
    }, {
      from: 'creditBureauReceipt',
      to: 'creditBureau'
    }, {
      from: 'creditCardPaymentReview',
      to: 'accountCreditCardPayment'
    }, {
      from: 'creditCardPaymentReview',
      to: 'cardCreditCardPayment'
    }, {
      from: 'disabilityVideocallHearingTacticalCalling',
      to: 'disabilityVideocallHearingTacticalPutAttention'
    }, {
      from: 'disabilityVideocallHearingTacticalPutAttention',
      to: 'disabilityVideocallHearingTactical'
    }, {
      from: 'dynamicsAndRewards',
      to: 'notificationManager'
    }, {
      from: 'fatcaValidationSuccess',
      to: 'fatcaValidation'
    }, {
      from: 'feedback',
      to: 'billPayments'
    }, {
      from: 'feedback',
      to: 'cardlessWithdrawalReview'
    }, {
      from: 'financingPurchaseReview',
      to: 'cardTransactions'
    }, {
      from: 'help',
      to: 'loading'
    }, {
      from: 'incrementReview',
      to: 'cardDetail'
    }, {
      from: 'instantCashReview',
      to: 'instantCash'
    }, {
      from: 'internationalTransfers',
      to: 'internationalTransfersReviewRecipient'
    }, {
      from: 'internationalTransfersPanel',
      to: 'operationals'
    }, {
      from: 'internationalTransfersPanel',
      to: 'operations'
    }, {
      from: 'keyRecovery',
      to: 'loading'
    }, {
      from: 'kycValidationSuccess',
      to: 'kycValidation'
    }, {
      from: 'listCreditCardLimits',
      to: 'operations'
    }, {
      from: 'mixCreditCardAndLoanReview',
      to: 'mixCreditCardAndLoan'
    }, {
      from: 'mobilePayment',
      to: 'operations'
    }, {
      from: 'mortgageReview',
      to: 'mortgage'
    }, {
      from: 'notificationManager',
      to: 'dynamicsAndRewards'
    }, {
      from: 'ocCarLoanAccountSelectionSuccess',
      to: 'ocCarLoanAccountSelection'
    }, {
      from: 'ocCarLoanContractSigningSuccess',
      to: 'ocCarLoanContractSigning'
    }, {
      from: 'ocMetaseguraOfferSuccess',
      to: 'ocMetaseguraOffer'
    }, {
      from: 'ocPaymentPlanCardErrorPage',
      to: 'ocPaymentPlanFixedPage'
    }, {
      from: 'ocPaymentPlanCardErrorPage',
      to: 'ocPaymentPlanRestructurePage'
    }, {
      from: 'ocPaymentPlanCardErrorPage',
      to: 'ocSupportFixedPaymentsPage'
    }, {
      from: 'ocPaymentPlanCardSuccessPage',
      to: 'ocPaymentPlanFixedPage'
    }, {
      from: 'ocPaymentPlanCardSuccessPage',
      to: 'ocPaymentPlanRestructurePage'
    }, {
      from: 'ocPaymentPlanCardSuccessPage',
      to: 'ocSupportFixedPaymentsPage'
    }, {
      from: 'ocPaymentPlanLoanErrorPage',
      to: 'ocLoanPaymentPlanRestructurePage'
    }, {
      from: 'ocPaymentPlanLoanErrorPage',
      to: 'ocPaymentPlanDecreaseAuto'
    }, {
      from: 'ocPaymentPlanLoanErrorPage',
      to: 'ocPaymentPlanDecreaseLoan'
    }, {
      from: 'ocPaymentPlanLoanSuccessPage',
      to: 'ocLoanPaymentPlanRestructurePage'
    }, {
      from: 'ocPaymentPlanLoanSuccessPage',
      to: 'ocPaymentPlanDecreaseAuto'
    }, {
      from: 'ocPaymentPlanLoanSuccessPage',
      to: 'ocPaymentPlanDecreaseLoan'
    }, {
      from: 'openDigitalAccountSuccess',
      to: 'loading'
    }, {
      from: 'parentalControlAccountLimits',
      to: 'operations'
    }, {
      from: 'parentalControlCardLimits',
      to: 'operations'
    }, {
      from: 'paymentsThirdPartyWalletProvisioning',
      to: 'operations'
    }, {
      from: 'payroll',
      to: 'operations'
    }, {
      from: 'payrollLink',
      to: 'payroll'
    }, {
      from: 'payrollLinkBenefits',
      to: 'payrollLink'
    }, {
      from: 'payrollLinkSuccess',
      to: 'payrollLinkBenefits'
    }, {
      from: 'payrollPortability',
      to: 'operations'
    }, {
      from: 'pendingMovementDetail',
      to: 'transfersPendingMovements'
    }, {
      from: 'pointsRaffleReview',
      to: 'rewards'
    }, {
      from: 'pointsTransferReview',
      to: 'rewards'
    }, {
      from: 'requestMoney',
      to: 'operations'
    }, {
      from: 'securityMenu',
      to: 'loading'
    }, {
      from: 'stOutBand',
      to: 'loading'
    }, {
      from: 'suspectedTransactionDirectDebits'
    }, {
      from: 'sustainabilityPage',
      to: 'loading'
    }, {
      from: 'transfers',
      to: 'operations'
    }, {
      from: 'transfersSuccess',
      to: 'transfers'
    }, {
      from: 'transfersSuccess',
      to: 'ocFrequentOperationsTransfer'
    }, {
      from: 'upgradeAccountCustomerDataPage',
      to: 'upgradeAccountPrevQuestionsPage'
    }, {
      from: 'upgradeAccountInitPage',
      to: 'account'
    }, {
      from: 'upgradeAccountInitPage',
      to: 'ocAccount'
    }, {
      from: 'upgradeAccountPrevQuestionsPage',
      to: 'upgradeAccountInitPage'
    }, {
      from: 'upgradeAccountReviewPage',
      to: 'upgradeAccountCustomerDataPage'
    }, {
      from: 'upgradeCustomer',
      to: 'operations'
    }, {
      from: 'validateEmailPage',
      to: 'updateEmailPage'
    }],
    onRender: function onrender(template) {
      updateHTTPPlugin();
      if (!template.parentNode) {
        document.getElementById('app__content').appendChild(template);
        var eventComponentsLoaded = document.createEvent('Event');
        eventComponentsLoaded.initEvent('componentsInTemplateLoaded', true, true);
        document.body.dispatchEvent(eventComponentsLoaded);
      }
    }
  });
  var proxyCustomElements = function proxyCustomElements() {
    var _customElementsDefine = window.customElements.define;
    window.customElements.define = (name, cl, conf) => {
      if (!customElements.get(name)) {
        _customElementsDefine.call(window.customElements, name, cl, conf);
      } else {
        console.warn(`${name} has been defined twice`);
      }
    };
  };
  proxyCustomElements();

  // Solved bug with zoom/scale of index.html
  document.documentElement.addEventListener('touchmove', function (event) {
    event = event.originalEvent || event;
    if (event.scale > 1) {
      event.preventDefault();
    }
  }, false);

  /**
   * Disable zoom on IOS devices over 10 IOS So version
   */
  document.addEventListener('gesturestart', function (e) {
    e.preventDefault();
  });
})(document);