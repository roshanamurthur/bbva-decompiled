/**
 *
 * # cells-product-summary-loan
 *
 * ![Certificated](https://img.shields.io/badge/certificated-yes-brightgreen.svg) ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)
 *
 * [Demo of component in Cells Catalog](https://catalogs.platform.bbva.com/cells)
 *
 * `<cells-product-summary-loan>` is a wrapper of 'cells-product-summary' that understands
 * the 'loan' the Canonical Data Model (CMD). That loan is binded into 'cells-product-summary',
 * which displays it. There are three different types: 'consume payroll', 'consume personal' and 'mortagage'.
 *
 * Example:
 *
 * ```html
 * <cells-product-summary-loan loan="[[myLoan]]" localCurrency="EUR"></cells-product-summary-loan>
 * ```
 *
 * ## Data model
 *
 * Receives an object with loan info:
 *
 * ```js
 * {
 *   "loanId": "1407",
 *   "loanType": {
 *     "id": "MORTGAGE",
 *     "name": "Crédito hipotecario"
 *   },
 *   "alias": "Hipoteca",
 *   "number": "54984185294",
 *   "numberType": {
 *     "id": "LIC",
 *     "name": "Local Internal Code"
 *   },
 *   "status": {
 *     "id": "VALID",
 *     "name": "Válido"
 *   },
 *   "title": {
 *     "id": "MORTGAGE_MX",
 *     "name": "Crédito Hipotecario BBVA Bancomer"
 *   },
 *   "nextInstallmentDate": "12-08-2017",
 *   "maturityDate": "12-08-2018",
 *   "openingDate": "01-10-2016",
 *   "contractingDate": "31-10-2016",
 *   "nextInterestRenewalDate": "01-12-2018",
 *   "annualFixedRate": 33.64,
 *   "pendingAmount": {
 *     "principal": {
 *       "amount": 20000,
 *       "currency": "MXN"
 *     },
 *     "interest": {
 *       "amount": 10000,
 *       "currency": "MXN"
 *     },
 *     "total": {
 *       "amount": 30000,
 *       "currency": "MXN"
 *     }
 *   },
 *   "initialAmount": {
 *     "amount": 15000,
 *     "currency": "MXN"
 *   },
 *   "amortisedAmount": {
 *     "amount": 4500.54,
 *     "currency": "MXN"
 *   },
 *   "currentInstallment": {
 *     "maturityDate": "13-11-2017",
 *     "principal": {
 *       "amount": 564.58,
 *       "currency": "MXN"
 *     },
 *     "interest": {
 *       "amount": 128,
 *       "currency": "MXN"
 *     },
 *     "number": 67943991
 *   },
 *   "totalInstallmentsNumber": {
 *     "pending": 20,
 *     "overdue": 10,
 *     "amortised": 95,
 *     "total": 115
 *   },
 *   "currencies": [{
 *     "currency": "MXN",
 *     "isMajor": true
 *   }],
 *   "periods": {
 *     "reviewPeriod": {
 *       "id": "MONTHLY",
 *       "name": "Mensual"
 *     },
 *     "liquidationPeriod": {
 *       "id": "MONTHLY",
 *       "name": "Mensual"
 *     }
 *   },
 *   "terms": {
 *     "number": 36,
 *     "frecuency": "MONTHLY"
 *   }
 * }
 * ```
 *
 * ## Styling
 *
 * The following custom properties and mixins are available for styling:
 *
 * ### Custom Properties
 * | Custom Property                                        | Selector                                                                                                            | CSS Property                       | Value                                                            |
 * | ------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------- | ---------------------------------- | ---------------------------------------------------------------- |
 * | --cells-fontDefault                                    | :host                                                                                                               | font-family                        | sans-serif                                                       |
 * | --cells-product-summary-loan-background                | :host                                                                                                               | background-color                   | rgba(238, 238, 238, 0.73)                                        |
 * | --bbva-600                                             | :host .installment-title                                                                                            | color                              | ![#121212](https://placehold.it/15/121212/000000?text=+) #121212 |
 * | --bbva-white                                           | :host .installment-title                                                                                            | background-color                   | ![#fff](https://placehold.it/15/fff/000000?text=+) #fff          |
 * | --cells-text-size-ml                                   | :host .installment-title                                                                                            | font-size                          | 0.9375rem                                                        |
 * | --cells-text-size-ml                                   | cells-product-summary > --cells-product-summary-status:                                                             | font-size                          | .9375rem                                                         |
 * | --bbva-white                                           | cells-loan-installment                                                                                              | background-color                   | ![#fff](https://placehold.it/15/fff/000000?text=+) #fff          |
 * | --bbva-500                                             | :host(.loan-product-detail) cells-product-summary > --cells-product-summary-optional-items-key-values-reversed-key: | color                              | `No fallback value`                                              |
 * | --cells-product-summary-loan-product-detail-min-height | :host(.loan-product-detail) cells-product-summary                                                                   | --cells-product-summary-min-height | rem(200px)                                                       |
 * ### @apply
 * | Mixins                                         | Selector                 | Value |
 * | ---------------------------------------------- | ------------------------ | ----- |
 * | --cells-product-summary-loan                   | :host                    | {}    |
 * | --cells-product-summary-loan-installment-title | :host .installment-title | {}    |
 * | --cells-product-summary-loan-product-summary   | cells-product-summary    | {}    |
 * | --cells-product-summary-loan-installment       | cells-loan-installment   | {}    |
 *
 * @polymer
 * @customElement
 * @summary is a wrapper of cells-product-summary that understands the loan the Canonical Data Model (CMD). That loan is binded into cells-product-summary, which displays it
 * @extends {Polymer.Element}
 * @demo demo/index.html
 * @hero cells-product-summary-loan.png
 */
class CellsProductSummaryLoan extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior
], Polymer.Element) {
  static get is() {
    return 'cells-product-summary-loan';
  }

  static get properties() {
    return {
      /** Object containing the information to show in the summary */
      loan: {
        type: Object,
        observer: '_loanChanged'
      },

      /** True if not loading */
      loaded: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },

      /** Flag to hide/show error message */
      loanError: {
        type: Boolean,
        value: false
      },

      /** More info's link label */
      labelMoreInfo: {
        type: String,
        value: 'cells-product-summary-loan-more-info'
      },

      /**
       * Text for the auxialiary link button.
       */
      labelAuxiliaryLinkButton: {
        type: String,
        value: ''
      },

      /** Flag to show/hide information other than main info */
      onlyMainInfo: {
        type: Boolean,
        value: false
      },
      /** Flag to show/hide info summary message */
      hiddenMessageInfoSummary: {
        type: Boolean,
        value: false
      },

      /** Error message icon */
      errorIcon: {
        type: String,
        value: 'coronita:alert'
      },

      /** Error message type */
      errorType: {
        type: String,
        value: 'error'
      },

      /** Error message text */
      errorMessage: {
        type: String,
        value: 'cells-product-summary-loan-error-message'
      },

      /**
       * Label moreInfoAriaLabel to be recognized by
       * the accessibility device helper
       * @type {String}
       */
      moreInfoAriaLabel: {
        type: String,
        value: 'cells-product-summary-loan-more-info-aria-label'
      },

      /**
       * @description Loan pending value
       * @type {Number}
       */
      _progressValueLeft: {
        type: Number
      },
      /**
       * @description Loan total value
       * @type {Number}
       */
      _progressMax: {
        type: Number
      },
      /**
       * @description Loan status
       * @type {Object}
       */
      _statusItem: {
        type: Object
      },
      /**
       * @description Auxiliary button to add extra funcionality
       * @type {Object}
       */
      auxiliaryButton: {
        type: Object,
        value: {
          text: 'cells-product-summary-loan-branch',
          icon: 'coronita:place'
        }
      },
      /**
       * @description Flag to show/hide the auxiliary button
       * @type {Boolean}
       */
      showAuxiliaryButton: {
        type: Boolean,
        value: false
      },
      /**
      * @description Shows or hides the auxiliary link button
      * @type {Boolean}
      */
      showAuxiliaryLinkButton: {
        type: Boolean,
        value: false
      },
      /**
       * @description Hide more info button?
       * @type {Boolean}
       */
      hideMoreInfoButton: {
        type: Boolean,
        value: false
      },
      /**
       * @description Disable the progress bar?
       * @type {Boolean}
       */
      disableProgressBar: {
        type: Boolean,
        value: false
      },
      /**
       * @description Product summary css class
       * @type {String}
       */
      _productSummaryClass: {
        type: String,
        computed: '_computeProductSummaryClass(loan)'
      },
      /**
       * @description Loan status id field to be used as the installment status id
       * @type {String}
       */
      installmentStatusIdField: {
        type: String,
        value: 'statusId'
      },
      /**
       * @description Product summary action error message
       * @type {String}
       */
      productSummaryActionErrorMessage: {
        type: String
      },
      /**
       * @description Product summary action error link
       * @type {String}
       */
      productSummaryActionErrorLink: {
        type: String
      },
      /**
       * @description Installment title
       * @type {String}
       */
      installmentTitle: {
        type: String,
        value: 'cells-product-summary-loan-installment-title'
      },
      /**
       * @description Is employee
       * @type {Boolean}
       */
      isEmployee: {
        type: Boolean,
        value: false
      },
      /**
       * @description Disable status message
       * @type {Boolean}
       */
      disableStatusMessage: {
        type: Boolean,
        value: false
      },
      /**
       * @description User info
       * @type {Object}
       */
      user: {
        type: Object,
        observer: 'setCustomersType'
      },
      /**
       * @description Product summary action error link
       * @type {String}
       */
      loanType: {
        type: String
      },
      /**
       * Flag to show icon message
       * @type {Boolean}
       */
      showIconMessage: {
        type: Boolean,
        value: false
      },
      /**
       * Message icon-message
       * @type {String}
       */
      messageIconInfo: {
        type: String,
        value: 'cells-product-summary-loan-icon-message-message'
      },
      /**
       * Title icon-message
       * @type {String}
       */
      messageHeadingIconInfo: {
        type: String,
        value: 'cells-product-summary-loan-icon-message-title'
      },
      /**
       * Text for button icon-message
       * @type {String}
       */
      buttonMessage: {
        type: String,
        value: 'cells-product-summary-loan-icon-message-button'
      },
      /**
       * Type for icon-message
       * @type {String}
       */
      iconMessageType: {
        type: String,
        value: 'warning'
      },
      /**
       * Icon for icon-message
       * @type {String}
       */
      iconMessageIcon: {
        type: String,
        value: 'coronita:info'
      },
      /**
      * Show the number of chars for mask the amount
      */
      maskedAmountNumberChars: {
        type: Number,
        value: 5
      },
      /**
      * If true, then amount is masked
      */
      maskedAmount: {
        type: Boolean,
        value: false
      },
      /**
       * @description If it is true, it shows a sustainable loan
       * @type {Boolean}
       */
      isSustainable: {
        type: Boolean,
        value: false
      },
      /**
       * @description Texts for sustainable lending steps
       * @type {Array}
       */
      _sustainableLoanSteps: {
        type: Array,
        value: () => [
          {
            title: 'bbva-progress-step-title-one',
            subtitle: 'bbva-progress-step-subtitle-one',
            status: 'completed'
          },
          {
            title: 'bbva-progress-step-title-two',
            subtitle: 'bbva-progress-step-subtitle-two',
            status: 'pending'
          },
        ]
      },
      /**
       * @description If it is true, it shows message for sustainable loan
       * @type {Boolean}
       */
      showMessage: {
        type: Boolean,
        value: false
      },
      /**
       * @description Flag to show entry point of uploading invoice
       * @type {Boolean}
       */
      isInvoiceReview: {
        type: Boolean,
        value: false
      },
      /**
       * @description Sustainable loan status
       * @type {Object}
       */
      sustainableLoanstatus: {
        type: Object,
        value: () => ({
          granted: 'GRANTED_SUSTAINABLE_LOAN',
          active: 'ACTIVE_SUSTAINABLE_PROPOSAL',
          expired: 'EXPIRED_SUSTAINABLE_PROPOSAL'
        })
      }
    };
  }
  /**
   * Resets the values of loan
   */
  reset() {
    this.loan = null;
    this._statusItem = null;
    this.onlyMainInfo = false;
    this.loaded = false;
    this.loanError = false;
    this.productSummaryActionErrorLink = undefined;
    this.showAuxiliaryLinkButton = false;
    this.isSustainable = false;
    this.isInvoiceReview = false;
    this.showMessage = false;
    this._fire('update-progress-step-values-sustainable-loan', []);
    this._fire('update-link-values-sustainable-loan', '');
    this._fire('navigation-loan-product-detail-back-request', '');
    this._fire('active-sustainable-loan', false);
  }

  _onClickMoreInfo() {
    /**
     * Fires event `cells-product-summary-more-info-navigation` when more info button is clicked
     * @event cells-product-summary-more-info-navigation
     */
    this.dispatchEvent(new CustomEvent('cells-product-summary-more-info-navigation', {
      bubbles: true,
      composed: true,
      detail: {
        productId: (this.loan || {}).productId
      }
    }));
  }

  _onClickAuxiliaryButton() {
    /**
     * Fires event `cells-product-summary-atm-locator-navigation` when auxiliary button is clicked
     * @event cells-product-summary-atm-locator-navigation
     */
    this.dispatchEvent(new CustomEvent('cells-product-summary-atm-locator-navigation', {
      bubbles: true,
      composed: true,
      detail: {
        productId: (this.loan || {}).productId
      }
    }));
  }

  _onOverdueClickMoreInfo() {
    /**
     * Fires event `cells-product-summary-overdue-more-info-navigation` when overdues more info button is clicked
     * @event cells-product-summary-overdue-more-info-navigation
     */
    this.dispatchEvent(new CustomEvent('cells-product-summary-overdue-more-info-navigation', {
      bubbles: true,
      composed: true,
      detail: {
        productId: (this.loan || {}).productId
      }
    }));
  }

  _onButtonClick() {
    /**
     * Fires event `summary-loan-button-clicked` when cells-product-summary > cells-icon-message > button is clicked
     * @event cells-product-summary-icon-message-button-clicked
     */
    this.dispatchEvent(new CustomEvent('cells-product-summary-icon-message-button-clicked', {
      bubbles: true,
      composed: true,
      detail: {}
    }));
  }

  _loanChanged(loan) {
    if (loan) {
      this.loanType = loan.loanTypeName;
      const optionalItems = loan.optionalItems;
      const sustainableAlternative = loan?.sustainableAlternative;
      this.isSustainable = sustainableAlternative && Object.keys(loan.sustainableAlternative).length > 0;
      if (this.isSustainable) {
        this._showSustainableLoan(sustainableAlternative);
      }
      if ((optionalItems || []).length > 0) {
        const pendingItem = optionalItems.find(item => item.type === 'pending');
        const totalItem = optionalItems.find(item => item.type === 'total');

        if (!this.disableProgressBar) {
          this._progressValueLeft = this.get('value.amount', pendingItem);
          this._progressMax = this.get('value.amount', totalItem);
        }
      }

      const statusItem = loan.statusItem;
      this.disableStatusMessage = this._getDisableStatusMessage(statusItem);
      if (!!statusItem && !this.disableStatusMessage) {
        this._statusItem = {
          name: this.t(statusItem.name),
          message: this.t(statusItem.message),
          class: statusItem.class
        };
      }
      this.onlyMainInfo = loan.onlyMainInfo;
    }
    this.loaded = !!loan;
  }

  _showMonthPayment(loan, loanError) {
    return !!(loan || {}).monthPayment && !loanError;
  }

  _computeProductSummaryClass(loan) {
    return this.get('class', loan) || '';
  }

  /**
   * Determines if the customer is an employee
   * @param {Object} user
   */
  setCustomersType(user) {
    const indicators = this.get('indicators', user);
    if (Array.isArray(indicators)) {
      const isEmployee = indicators.find(e => e.id === 'EMPLOYEE');
      this.set('isEmployee', !!(this.get('isActive', isEmployee)));
    }
  }

  /**
   * Determines if overdue message should be shown
   * @param {Object} statusItem
   */
  _getDisableStatusMessage(statusItem) {
    const isOverdue = String(this.get('name', statusItem)).includes('overdue') || String(this.get('message', statusItem)).includes('overdue') || String(this.get('class', statusItem)).includes('overdue');
    return isOverdue && this.isEmployee;
  }

  /**
   * Returns the statusId field of the loan.
   */
  _getStatusId(loan) {
    return loan[this.installmentStatusIdField];
  }

  /**
   * Set icon message config
   */
  setIconMessageConfig(config) {
    const {
      showIconMessage = false,
      iconMessageType = this.iconMessageType,
      iconMessageIcon = this.iconMessageIcon,
      messageHeadingIconInfo = this.messageHeadingIconInfo,
      messageIconInfo = this.messageIconInfo,
      buttonMessage = this.buttonMessage
    } = config;

    this.showIconMessage = showIconMessage;
    this.iconMessageType = iconMessageType;
    this.iconMessageIcon = iconMessageIcon;
    this.messageHeadingIconInfo = messageHeadingIconInfo;
    this.messageIconInfo = messageIconInfo;
    this.buttonMessage = buttonMessage;
  }

  /**
   * Determine what message to paint according to the sustainable loan status
   * The order of the if is by priority because the API does not have 2 cases.
   * @param {Object} sustainableAlternative
   */
  _showSustainableLoan(sustainableAlternative) {
    const apiStatus = sustainableAlternative.status.id;
    /* istanbul ignore else */
    if (this.sustainableLoanstatus.granted === apiStatus) {
      this._showOnlySustainableLoanSteps('completed');
    } else if (sustainableAlternative.elapsedDaysLoan > 30) {
      this._showCompleteSustainableLoan({
        title: this.t('bbva-notification-message-title-rejected'),
        message: this.t('bbva-notification-message-rejected'),
        step: 'error'
      });
    } else if (this.isInvoiceReview) {
      this._showOnlySustainableLoanSteps('pending');
    } else if (this.sustainableLoanstatus.active  === apiStatus) {
      this._showActiveSustainableProposal(sustainableAlternative.remainingDays);
    } else if (this.sustainableLoanstatus.expired === apiStatus) {
      this._showCompleteSustainableLoan({
        title: this.t('bbva-notification-message-title-expireded'),
        message: this.t('bbva-notification-message-expireded'),
        step: 'error'
      });
    }
  }

  /**
   * Shows and updates the texts when the sustainable loan is active.
   * @param {Number} remainingDays
   */
  _showActiveSustainableProposal(remainingDays) {
    this.showMessage = true;
    this._fire('active-sustainable-loan', true);
    this._fire('update-title-values-sustainable-loan', this.t('bbva-notification-message-title-active'));
    this._fire('update-message-values-sustainable-loan', this.t('bbva-notification-message-active', '', { remainingDays }));
    this._fire('update-link-values-sustainable-loan', this.t('bbva-notification-link-name'));
    this._updateSustainableLoanSteps('pending');
  }

  /**
   * Shows only step bar and hides the message in the sustainable loan.
   * @param {String} step
   */
  _showOnlySustainableLoanSteps(step) {
    this.showMessage = false;
    this._updateSustainableLoanSteps(step);
  }

  /**
   * Shows message and step bar in the sustainable loan.
   * @param {Object} details
   */
  _showCompleteSustainableLoan(details) {
    this.showMessage = true;
    const { title, message, step } = details;
    this._fire('update-title-values-sustainable-loan', title);
    this._fire('update-message-values-sustainable-loan', message);
    this._updateSustainableLoanSteps(step);
  }

  /**
   * Update the status of the sustainable loan steps according to the status received.
   * @param {String} step
   */
  _updateSustainableLoanSteps(progressStatus) {
    this._sustainableLoanSteps[1].status = progressStatus;
    this._fire('update-progress-step-values-sustainable-loan', this._sustainableLoanSteps);
  }

  /**
   * @desc Fires event `set-local-storage-sustainable-loan-review`to generate
   * a flag when sustainable credit bills are uploaded
   * @event set-local-storage-sustainable-loan-review
   */
  activeFlagSustainableLoanReview() {
    this._fire('set-local-storage-sustainable-loan-review', {
      key: 'sustainable_loan_review',
      value: {
        sustainable_loan_review: true
      }
    });
  }
  /**
   * @desc Fires event `set-local-storage-sustainable-loan-review` to obtain from
   * local storage if a sustainable loan already sent invoices
   * @event get-local-storage-sustainable-loan-review
   */
  getStorageSustainableLoan() {
    this._fire('get-local-storage-sustainable-loan-review', { key: 'sustainable_loan_review' });
  }

  /**
   * @desc Response to localstorage data loan
   * @param {Object} storageResponse
   */
  saveLocalStorageSustainableLoan(storageResponse) {
    this.isInvoiceReview = storageResponse.code === 999 ? false : storageResponse.sustainable_loan_review;
  }

  /**
    * Dispatches a custom event with the specified event name and detail.
    * @param {string} eventName - The name of the event to be dispatched.
    * @param {*} detail - The detail object to be attached to the event.
    */
  _fire(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail
    }));
  }
}
window.customElements.define(CellsProductSummaryLoan.is, CellsProductSummaryLoan);
