/*global GlomoRefundTransferManagerMixin*/
class GlomoRefundTransferManagerMx extends GlomoRefundTransferManagerMixin {

  static get is() {
    return 'glomo-refund-transfer-manager-mx';
  }

  static get properties() {
    return {
      /**
      * alertData to launch to glomo alert mannager
      * @type {Object}
      */
      alertData: {
        type: Object,
        value: () => ({})
      },

      /**
      * refundData to get info from transaction detail
      * @type {Object}
      */
      refundData: {
        type: Object,
        value: () => ({})
      },

      /**
      * accountInformation to get info from account transaction detail
      * @type {Object}
      */
      accountInformation: {
        type: Object,
        value: () => ({})
      },

      /**
      * errorModalData to launch glomo alert mannager
      * @type {Object}
      */
      errorModalData: {
        type: Object,
        value: () => ({})
      },

      /**
      * warningModalData to launch warning exit modal
      * @type {Object}
      */
      warningModalData: {
        type: Object,
        value: {
          id: 'warningRefund',
          code: 'warning-exit-refund-spei',
          primaryButtonClass: 'primary',
          selectedConfig: {
            className: 'error',
            hideCloseIcon: true,
            openMaximized: false,
            acceptBtLabel: '',
            cancelBtLabel: '',
            template: {
              type: 'paragraphs',
              values: [
                { icon: 'coronita:alert' },
                { text: '' }
              ]
            }
          }
        }
      },

      /**
      * userEmail to send in success
      * @type {String}
      */
      userEmail: {
        type: String,
        value: ''
      },

      /**
      * serviceResponse to send save response
      * @type {Object}
      */
      serviceResponse: {
        type: Object,
        value: () => ({})
      },

      /**
      * image to show in refund modal info
      * @type {String}
      */
      refundModalInfoImage: {
        type: String,
        value: ''
      },

      /**
      * image to show in refund review
      * @type {String}
      */
      successResponseRefundAvatar: {
        type: String,
        value: ''
      },

      /**
      * productId get from native
      * @type {String}
      */
      productId: {
        type: String,
        value: ''
      },

      /**
      * object with local cache information
      * @type {Object}
      */
      localCache: {
        type: Object,
        value: () => ({})
      },

      /**
      * inform if its localRepo
      * @type {Boolean}
      */
      itsLocal: {
        type: Boolean,
        value: false
      },

      /**
      * inform if its native ios
      * @type {Boolean}
      */
      itsNativeIos: {
        type: Boolean,
        value: false
      },

      /**
      * productId from ios
      * @type {Object}
      */
      productIdFromIos: {
        type: Object,
        value: () => ({})
      },
      /**
       * config featureFlagCollection by channel with allowed flags
       * @type {Object}
       */
      featureFlagCollection: {
        type: Object,
        value: () => ({})
      },
    };
  }

  /**
  * Fire events to refresh dashboard and product detail pages
  * @return {void}
  */
  exitAndRefreshDashboard() {
    this._fireEvent('refresh-account-detail-channel', {
      productType: 'ACCOUNTS',
      productNumber: this.accountInformation.number
    });
    this._fireEvent('refresh-dashboard-channel', {
      productType: 'DEPOSITS',
      productId: this.accountInformation.accountId
    });
  }

  /**
  * Gets customer info, used to get client's email
  */
  getCustomerInfo() {
    let customerId = this.localCache.customer.customerId;
    this._fireEvent('customer-id-to-customers-global-api', customerId);
    this._fireEvent('get-customer-info');
  }

  /**
  * Gets successful response from customers api
  * @param {response} response
  * @return {void}
  */
  successfulCustomerDetailsResponse(response) {
    let contactData = response.find(data => data.contact.contactDetailType === 'EMAIL');
    this.userEmail = contactData.contact.address;
  }

  /**
  * Extract and set accountInformation from local cache
  *
  * @return {void}
  *
  */
  extractLocalCacheAccountInformation() {
    if (this.itsNativeIos) {
      this.productId = this.productIdFromIos.contractId;
    }
    this.accountInformation = this.localCache.dashboard.accounts.find(product => product.accountId === this.productId);
    this._fireEvent('local-account-information-to-analytics', this.accountInformation);
  }

  /**
  * Fires modal to show info to return money
  *
  * @return {void}
  */
  init() {
    if (this.itsLocal) {
      this.extractLocalCacheAccountInformation();
      this.getCustomerInfo();
    }
    this.alertData = {
      code: 'info-refund-spei',
      primaryButtonClass: 'primary',
      textWithIcon: 'text-with-icon spacing-left',
      selectedConfig: {
        className: 'refunds full-height-info close-button--right',
        openMaximized: true,
        title: this.t('transfer-refunds-spei-modal-info-title'),
        heroImage: this.refundModalInfoImage,
        message: this.t('transfer-refunds-spei-modal-info-title'),
        acceptBtLabel: this.t('transfer-refunds-spei-modal-info-title'),
        cancelBtLabel: this.t('transfer-refunds-spei-modal-cancel'),
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.t('transfer-refunds-spei-modal-subtitle'),
              class: 'spacing-left'
            },
            {
              list: [
                this.t('transfer-refunds-spei-modal-info-1'),
                this.t('transfer-refunds-spei-modal-info-2'),
                this.t('transfer-refunds-spei-modal-info-3'),
                this.t('transfer-refunds-spei-modal-info-4')
              ],
              class: 'cells-lists-with-text-left'
            }
          ]
        }
      }
    };
    this._fireEvent('show-modal-refunds-info', this.alertData);
  }

  /**
  * Function to fill step 1
  * @return {void}
  */
  _createProductSelectorObject() {
    const stepProductSelectorObject = {
      name: this.accountInformation.alias,
      id: this.accountInformation.accountId,
      description: {
        value: this.accountInformation.number,
        masked: true
      },
      primaryAmount: {
        amount: this.accountInformation.availableBalance.currentBalances[0].amount,
        currency: this.accountInformation.availableBalance.currentBalances[0].currency,
        label: this.t('transfer-refunds-spei-step-product-selector-primary-amount-label')
      }
    };
    this._fireEvent('fill-selected-to-step-1', stepProductSelectorObject);
  }

  /**
  * Function to fill step 2
  * @return {void}
  */
  _createRecipientObject() {
    const steprecipientSelectedObject = {
      avatar: true,
      name: this.refundData.detail.sender.firstName,
      listItems: [
        {
          description: this.refundData.detail.sender.contract.contractNumber
        },
        {
          description: this.refundData.detail.sender.contract.bank.name
        }
      ]
    };
    this._fireEvent('fill-recipient-selected-to-step-2', steprecipientSelectedObject);
  }

  /**
  * Function to fill step 3
  * @return {void}
  */
  _createAmountObject() {
    const amountValue = this.refundData.originAmount.amount;
    const currencyValue = this.refundData.originAmount.currency;
    this._fireEvent('fill-amount-to-step-3', amountValue);
    this._fireEvent('fill-currency-to-step-3', currencyValue);
  }

  /**
  * Function to fill step 4
  * @return {void}
  */
  _createReferenceObject() {
    const referenceValue = this.refundData.detail.customExternalReference.value;
    this._fireEvent('fill-reference-to-step-4', referenceValue);
    this._fireEvent('fill-concept-to-step-4', this.t('transfer-refunds-spei-success-additional-info-concept-value'));
  }

  /**
  * Function to fill summary
  *
  * @return {void}
  */
  _createSummaryObject() {
    const summaryObject = {
      amount: {
        amount: this.refundData.originAmount.amount,
        currency: this.refundData.originAmount.currency
      },
      status: {
        id: 'SETTLED',
        name: 'Settled'
      },
      fees: [
        {
          feeType: {
            id: 'TOTAL_FEE',
            name: 'Total fee'
          },
          feeAmount: {
            amount: 0,
            currency: this.refundData.originAmount.currency
          }
        }
      ],
      totalFees: {
        text: this.t('transfer-refunds-spei-sumary-total-fee-text'),
        amount: 0,
        currency: this.refundData.originAmount.currency
      }
    };
    this._fireEvent('fill-operation-summary', summaryObject);
    this._fireEvent('show-confirm-zone', true);
  }

  /**
  * Call diferents metods to load multistep
  *
  * @return {void}
  */
  sendParamsToMultistep() {
    this._showSpinner();
    this.closeModal();
    if (this.accountInformation.availableBalance.currentBalances[0].amount < this.refundData.originAmount.amount) {
      this.modalErrorRefunds();
    } else {
      this._createProductSelectorObject();
      this._createRecipientObject();
      this._createAmountObject();
      this._createReferenceObject();
      this._createSummaryObject();
    }
    this._hideSpinner();
  }

  /**
  * Function to show modal error
  *
  * @return {void}
  */
  modalErrorRefunds() {
    this.errorModalData = {
      time: 400,
      id: 'errorRefund',
      code: 'info-error-refund-spei',
      primaryButtonClass: 'primary',
      textWithIcon: 'text-with-icon spacing-left',
      selectedConfig: {
        className: 'refund-error full-height-error close-button--right',
        hideCloseIcon: false,
        openMaximized: true,
        title: this.t('transfer-refunds-spei-modal-error'),
        heroImage: './images/errors/fo_error.svg',
        message: this.t('transfer-refunds-spei-modal-error-message'),
        acceptBtLabel: this.t('transfer-refunds-spei-modal-error-accept-btn-label'),
        showAvatar: true,
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.t('transfer-refunds-spei-modal-error-text-1') + this.accountInformation.availableBalance.currentBalances[0].amount + this.t('transfer-refunds-spei-modal-error-text-2')
            }
          ]
        }
      }
    };
    this._fireEvent('show-modal-refunds-info', this.errorModalData);
    this._fireEvent('launch-error-analytic-info');
  }

  /**
  * Function to show modal warning exit modal
  *
  * @return {void}
  */
  warningExitModal() {
    this.warningModalData.selectedConfig.acceptBtLabel = this.t('transfer-refunds-spei-modal-warning-accept-btn-label');
    this.warningModalData.selectedConfig.cancelBtLabel = this.t('transfer-refunds-spei-modal-warning-cancel-btn-label');
    this.warningModalData.selectedConfig.template.values[1].text = this.t('transfer-refunds-spei-modal-warning-text');
    this._fireEvent('show-modal-refunds-info', this.warningModalData);
    this._fireEvent('launch-warning-analytic-info');
  }

  /**
  * Function to send parms to Api
  *
  * @return {void}
  */
  requestRefundservice() {
    let params = {};
    let body = {
      transactionId: this.refundData.id
    };

    if (this.featureFlagCollection['glomo.transfers.refundTransfersPaymentsHub']?.value) {
      body.reason = 'ordinary-interbank-transfer';
    }

    this._fireEvent('params-refunds', params);
    this._fireEvent('body-refunds', body);
  }

  /**
  * Function to send payload to Refunds Review
  *
  * @return {void}
  */
  successResponseRefund(response) {
    this.serviceResponse = response;
    this._showSpinner();
    const refundInfo = {
      id: response.id,
      date: response.operationDate,
      title: this.t('transfer-refunds-spei-modal-info-title-success'),
      amountLabel: this.t('transfer-refunds-spei-success-amount-label'),
      origin: {
        product: {
          id: response.sender.contract.contractId,
          name: this.accountInformation.alias
        },
        number: response.sender.contract.number,
        avatar: this.successResponseRefundAvatar
      },
      destination: {
        product: {
          id: response.receiver.contract.specificProductType,
          name: response.receiver.holder.holderName
        },
        number: response.receiver.contract.number,
        description: response.receiver.contract.bank.name,
        avatar: true
      },
      isOriginCardType: true,
      fees: [
        {
          text: this.t('transfer-refunds-spei-sumary-total-fee-text'),
          amount: 0,
          currency: response.sentMoney[0].currency
        }
      ],
      chargeAmount: {
        amount: response.sentMoney[0].amount,
        currency: response.sentMoney[0].currency,
        class: 'amount-huge-decimals'
      },
      additionalInfo: [
        {
          key: this.t('transfer-refunds-spei-success-additional-info-concept-key'),
          value: this.t('transfer-refunds-spei-success-additional-info-concept-value'),
          class: 'spacing'
        },
        {
          key: this.t('transfer-refunds-spei-success-additional-info-reference-key'),
          value: response.customExternalReference,
          class: 'spacing'
        },
        {
          key: this.t('transfer-refunds-spei-success-additional-info-operation-type-key'),
          value: this.t('transfer-refunds-spei-success-additional-info-operation-type-value'),
          class: 'spacing'
        },
        {
          key: this.t('transfer-refunds-spei-success-additional-info-invoice-key'),
          value: response.operationNumber,
          class: 'spacing'
        },
        {
          key: this.t('transfer-refunds-spei-success-additional-info-tracking-key'),
          value: response.references[0].value,
          class: 'spacing'
        },
        {
          key: this.t('transfer-refunds-spei-success-additional-info-receipt-key'),
          class: 'spacing-l bold',
          musk: {
            value: this.userEmail,
            chars: 14,
            simbol: '•'
          }
        }
      ],
      operations: [
        {
          label: this.t('transfer-refunds-spei-success-operations-share-label'),
          id: 'share',
          icon: 'coronita:share'
        }
      ],
      buttons: {
        primary: {
          text: this.t('transfer-refunds-spei-modal-warning-accept-btn-label'),
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      },
      transferType: response.sender.contract.numberType.id
    };
    this._hideSpinner();
    this._fireEvent('successful-response-to-review', refundInfo);
  }

  /**
  * Function to send payload to error refund Modal
  *
  * @return {void}
  */
  errorResponseRefund(response) {
    this._fireEvent('error-response-refund', response);
  }

  /**
  *Funtion to send payload to share receipt
  *
  * @return {void}
  */
  shareReceipt() {
    const receiptData = {
      date: this.serviceResponse.operationDate,
      originAccount: this.accountInformation.alias,
      chargeAmount: '',
      localAmount: {
        amount: this.serviceResponse.sentMoney[0].amount,
        currency: this.serviceResponse.sentMoney[0].currency
      },
      fees: [
        {
          text: this.t('transfer-refunds-spei-sumary-total-fee-text'),
          amount: 0,
          currency: this.serviceResponse.sentMoney[0].currency
        }
      ],
      templateSelected: 'genericTransferDetail',
      folioNumber: this.serviceResponse.operationNumber,
      operationType: this.t('transfer-refunds-spei-share-receipt-operation-type'),
      beneficiary: {
        name: this.serviceResponse.receiver.holder.holderName,
        bank: this.serviceResponse.receiver.contract.bank.name,
        number: this.serviceResponse.receiver.contract.number
      },
      concept: this.t('transfer-refunds-spei-success-additional-info-concept-value'),
      description: this.t('glomo-transfer-share-interbank-transfer-description')
    };
    this._fireEvent('share-refund-receipt', receiptData);
  }

  /**
  *Function to clean the data objects
  *
  * @return {void}
  */
  reset() {
    this.refundData = {};
    this.serviceResponse = {};
    this.closeModal();
    this._fireEvent('exit-refunds');
    this._fireEvent('show-confirm-zone', false);
  }
}

customElements.define(GlomoRefundTransferManagerMx.is, GlomoRefundTransferManagerMx);