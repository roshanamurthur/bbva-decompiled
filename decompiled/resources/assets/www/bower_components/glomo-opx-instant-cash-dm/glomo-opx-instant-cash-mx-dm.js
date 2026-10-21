/* eslint-disable new-cap */
/* eslint-disable no-undef */
class GlomoOpxInstantCashMxDm extends GlomoOpxInstantCashDmMixin.mixin(
  Polymer.mixinBehaviors([ CellsBehaviors.StepManagerBehavior ], CellsBehaviors.AmountBehavior(Polymer.Element))) {
  static get is() {
    return 'glomo-opx-instant-cash-mx-dm';
  }

  static get properties() {
    return {
      host: String,
      cardsApiVersion: String,
      native: Boolean,
      requiredToken: String,
      cardId: {
        type: String,
        resettable: true
      },
      commisionDinamicAmount: {
        type: Number,
        value: null,
        resettable: true
      },
      calculationDateDinamic: {
        type: String,
        resettable: true
      },
      period: {
        type: String,
        resettable: true
      },
      offerId: {
        type: String,
        resettable: true
      },
      customerType: {
        type: String,
        resettable: true
      },
      contactDetails: {
        type: Object,
        value: () => ({})
      },
      localCurrency: String,
      customerEmail: String,
      financialOverview: {
        type: Object,
        value: () => ({}),
      },
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      totalHeight: {
        type: String,
        value: '1600'
      },
      currentDispositionCommission: {
        type: Number,
        value: null,
        resettable: true
      },
      currentSelectedTerm: {
        type: Number,
        value: null,
        resettable: true
      },
      _lastValidTermSelected: {
        type: Number,
        value: null,
        resettable: true
      },
      lastSimulatedTerm: {
        type: Number,
        value: null,
        resettable: true
      },
      currentSelectedAmount: {
        type: Number,
        value: null,
        resettable: true
      },
      _lastValidAmountSelected: {
        type: Number,
        value: null,
        resettable: true
      },
      lastSimulatedAmount: {
        type: Number,
        value: null,
        resettable: true
      },
      _isTermSimulation: {
        type: Boolean,
        value: false,
        resettable: true
      },
      amountInputIsValid: {
        type: Boolean,
        value: false,
        resettable: true
      },
      associatedCard: {
        type: Object,
        value: () => null,
        resettable: true
      },
      selectedDepositAccount: {
        type: Object,
        value: () => null,
        resettable: true
      },
      depositAccountsList: {
        type: Array,
        value: () => ([]),
        resettable: true
      },
      hasAnyOpenModal: {
        type: Boolean,
        value: false,
        resettable: true
      },
      userModifiedOperative: {
        type: Boolean,
        value: false,
        resettable: true
      },
      isGlobal: {
        type: Boolean,
        value: false
      },
      /**
       * @description Assistance Availability flag
       * @type {Boolean}
       */
      assistanceAvailability: {
        type: Boolean,
        value: false
      },
      /**
        * @description Call from Header
        * @type {String}
        * */
      callActionHeader: {
        type: Boolean,
        value: false
      },
      /**
       * @description Phone number contact
       * @type {String}
       */
      phoneNumberAdvisor: {
        type: String
      },
      /**
       * @description get customer id
       * @type {String}
       */
      customerId: {
        type: String,
        value: false
      },
      /**
       * @description parsed user email
       * @type {String}
       */
      userEmail: {
        type: String,
        value: ''
      }
    };
  }

  /**
   * Event for AppsFlyer in Dynamic Life Insurance
   * @param {String} eventName
   * @param {Object} eventValue
   */
  _sendAppsFlyerInstantCash(eventName, eventValue) {
    this._dispatchEvent('apps-flyer-instant-cash', {
      eventName,
      eventValue
    });
  }

  initialize() {
    this.initResponseHandlers();
    this._dispatchEvent('init-steps');
    this.onGetFinancialOverview();
    this.getCustomerDetail();
    this._sendAppsFlyerInstantCash('detalle_oferta_efi', {});
  }

  registerStepsTest(params) {
    this.registerStep(params);
  }

  /**
  * Init and manage cache products
  */
  init() {
    this.restart();
    this.started = true;
    this.finished = false;
    this.hideRecipient();
  }

  /**
  * Restart state steps
  */
  restart() {
    setTimeout(() => {
      this.initSteps();
    }, 1000);
  }

  reset() {
    this.hideRecipient();
    this.resetWithDefaultSettings();
    this.resetResponseOperators();
    this.resetProperties();
    this.resetOperative();
  }

  /**
  *Format amount
  */
  _getFormattedExec(amount, currency) {
    return this.getFormattedAmount(amount, currency, this.localCurrency, 'es-MX', false, ',', '$', '');
  }

  exitOperative() {
    this.resetOperative();
    this._dispatchEvent('exit-operative');
    this.resetWithDefaultSettings();
  }

  resetOperative() {
    this._dispatchEvent('reset-operative');
  }

  /**
   * set email from context
   * @param {String} email
   */
  setEmail(email) {
    this.userEmail = email.replace(/\*+/g, '•');
  }

  /**
    * Flag in true form call action from header
    * Onclick, dispatch event for call me back page
  */
  onClickCallHeader() {
    this.callActionHeader = true;
    this.fireCallMeBackPage();
  }
  /**
   * This function by cells-st-button event
   * to request to callMeBack
   */
  fireCallMeBackPage() {
    if (this.assistanceAvailability) {
      this._dispatchEvent('call-personal-advisor-number', {phoneNumberAdvisor: this.phoneNumberAdvisor, callActionHeader: this.callActionHeader});
    } else {
      const {offerId, customerType} = this;
      if (offerId) {
        this._dispatchEvent('fire-call-me-back', {offerId, customerType});
      }
    }
  }
  /**
     * Dispatch Event for call me back button text
     * @event set-secondary-text-button
     */
  _secondaryText() {
    const text = this.assistanceAvailability ? 'call-me-back-assistance-manager-secondary-button' : 'instant-cash-first-step-sticky-section-secondary-button-label';
    this._dispatchEvent('set-secondary-text-button', {
      summaryViewTitle: 'instant-cash-first-step-sticky-section-summary-view-title',
      showAddition: true,
      showLoadingSkeleton: true,
      primaryButtonLabel: 'instant-cash-first-step-sticky-section-primary-button-label',
      hidePrimaryButton: false,
      disabledPrimaryButton: false,
      showSecondaryButton: true,
      secondaryButtonLabel: text,
      secondaryButtonEvent: 'first-step-secondary-button-pressed',
      disabledSecondaryButton: false,
      showLegalTerms: false,
      hideCustomFeesMessage: true
    });
  }

  _getContactEmail() {
    if (this.contactDetails && this.contactDetails.contactDetails) {
      const email = this.contactDetails.contactDetails.find(item => item.contactType.id === 'EMAIL');
      if (email.contact) {
        return `•${email.contact.split('*')[email.contact.split('*').length - 1]}`;
      }
    }
    return '';
  }

  handleNativeBackButton() {
    if (this.hasAnyOpenModal) {
      this._dispatchEvent('close-current-open-modal');
    } else {
      this.canExitOperativeStraightForward();
    }
  }

  canExitOperativeStraightForward() {
    if (this.userModifiedOperative) {
      this.openConfirmModal();
    } else {
      this.exitOperative();
    }
  }

  hideRecipient() {
    this._dispatchEvent('change-recipient-hidden-prop', true);
  }

  showRecipient() {
    this._dispatchEvent('change-recipient-hidden-prop', false);
  }


  saveDataOffers(simulationFlag) {
    const changeFormatAomunt = this._getFormattedExec(this.currentSelectedAmount, this.localCurrency);
    if (simulationFlag === 'offerSimulation') {
      const {
        requestedTermValue, requestedAmountValue, catRate,
        mensualRateValueAsPercentage, catRateValueAsPercentage, catRateValueAsTruncated, annualRateValueAsPercentage,
        dispositionCommissionValueAsAmount, installmentAmountValue, installmentAmountValueAsAmount, dispositionCommissionValue
      } = this.responseOperators.offerSimulationOperator.processor;
      this.commisionDinamicAmount = dispositionCommissionValueAsAmount;
      this.calculationDateDinamic = catRate.calculationDate;
      const filledSummarySet = {
        filledSummary: [
          {
            keyValues: {
              key: 'instant-cash-first-step-filled-summary-amount-requested-key',
              value: {
                amount: this.currentSelectedAmount,
                currencyCode: 'MXN',
                class: 'currency-xxxxl on-dark',
                decimalsHidden: false,
              },
              class: 'on-dark'
            }
          },
          {
            topDivider: true,
            keyValuesList: {
              list: [
                {
                  key: 'instant-cash-first-step-filled-summary-monthly-payment-key',
                  value: installmentAmountValueAsAmount,
                  class: 'inline on-dark'
                },
                {
                  key: 'instant-cash-first-step-filled-summary-term-key',
                  value: `${this.lastSimulatedTerm} meses`,
                  class: 'inline on-dark'
                }
              ]
            }
          },
          {
            topDivider: true,
            keyValuesList: {
              list: [
                {
                  key: 'instant-cash-first-step-filled-summary-cat-rate-key',
                  value: this.removeLastZeroCatRateValue(catRateValueAsTruncated),
                  class: 'inline on-dark value-bold'
                },
                {
                  key: 'instant-cash-annual-rate-by-simulation-modal-title',
                  value: annualRateValueAsPercentage,
                  class: 'inline on-dark value-bold'
                },
                {
                  key: 'instant-cash-first-step-filled-summary-commission-per-disposition-key',
                  value: dispositionCommissionValueAsAmount,
                  class: 'inline on-dark'
                },
              ]
            }
          }
        ]
      };
      this._dispatchEvent('persist-current-selected-amount', filledSummarySet.filledSummary);
      this.iconTextDinamic();
    } else if (simulationFlag === 'offerDetails') {
      const {
        minimumAmountValue, maximumAmountValue, maximumAmountValueAsAmount, suggestedTermValue,
        suggestedAmountValue, suggestedAmountValueAsAmount, mensualRateValueAsPercentage, catRate,
        catRateValueAsPercentage, catRateValueAsTruncated, annualRateValueAsPercentage, dispositionCommissionValue,
        dispositionCommissionValueAsAmount, installmentAmountValue, installmentAmountValueAsAmount, allowedTermsItems
      } = this.responseOperators.offerDetailOperator.processor;
      this.commisionDinamicAmount = dispositionCommissionValueAsAmount;
      this.calculationDateDinamic = catRate.calculationDate;
      const filledSummarySet = {
        filledSummary: [
          {
            keyValues: {
              key: 'instant-cash-first-step-filled-summary-amount-requested-key',
              value: {
                amount: this.currentSelectedAmount,
                currencyCode: 'MXN',
                class: 'currency-xxxxl on-dark',
                decimalsHidden: false,
              },
              class: 'on-dark'
            }
          },
          {
            topDivider: true,
            keyValuesList: {
              list: [
                {
                  key: 'instant-cash-first-step-filled-summary-monthly-payment-key',
                  value: installmentAmountValueAsAmount,
                  class: 'inline on-dark'
                },
                {
                  key: 'instant-cash-first-step-filled-summary-term-key',
                  value: `${this.lastSimulatedTerm} meses`,
                  class: 'inline on-dark'
                }
              ]
            }
          },
          {
            topDivider: true,
            keyValuesList: {
              list: [
                {
                  key: 'instant-cash-first-step-filled-summary-cat-rate-key',
                  value: this.removeLastZeroCatRateValue(catRateValueAsTruncated),
                  class: 'inline on-dark value-bold'
                },
                {
                  key: 'instant-cash-annual-rate-by-simulation-modal-title',
                  value: annualRateValueAsPercentage,
                  class: 'inline on-dark value-bold'
                },
                {
                  key: 'instant-cash-first-step-filled-summary-commission-per-disposition-key',
                  value: dispositionCommissionValueAsAmount,
                  class: 'inline on-dark'
                },
              ]
            }
          }
        ]
      };
      this._dispatchEvent('persist-current-selected-amount', filledSummarySet.filledSummary);
      this.iconTextDinamic();
      if (suggestedAmountValue < maximumAmountValue) {
        this._dispatchEvent('has-icon-message-top-amount', true);
        this.iconTextDinamicTop();
      }
    }
  }

  removeLastZeroCatRateValue(catRateValue) {
    return `${catRateValue.slice(0, -1)}%`;
  }

  iconTextDinamicTop() {
    const {
      minimumAmountValue, maximumAmountValue, maximumAmountValueAsAmount, suggestedTermValue,
      suggestedAmountValue, suggestedAmountValueAsAmount, mensualRateValueAsPercentage, catRate,
      catRateValueAsPercentage, catRateValueAsTruncated, annualRateValueAsPercentage, dispositionCommissionValue,
      dispositionCommissionValueAsAmount, installmentAmountValue, installmentAmountValueAsAmount, allowedTermsItems
    } = this.responseOperators.offerDetailOperator.processor;
    const aux = [
      {
        path: 'iconMessageTopAmount.0.iconMessageTop.message',
        value: `Tu oferta máxima es de ${maximumAmountValueAsAmount}, en este momento puedes disponer de hasta ${suggestedAmountValueAsAmount}.<br><br>Puedes hacer pagos a tu tarjeta de crédito para liberar el saldo que necesitas y tener tu oferta máxima.`
      },
    ];
    aux.forEach(prop => this._dispatchEvent('set-step-instant-cash-property', prop));
    this._dispatchEvent('manage-first-step-summary-content', false);
    this.dispatchEvent(new CustomEvent('set-modal-selector-properties', {
      bubbles: true,
      composed: true,
      detail: allowedTermsItems
    }));
  }

  iconTextDinamic() {
    const {
      minimumAmountValue, maximumAmountValue, maximumAmountValueAsAmount, suggestedTermValue,
      suggestedAmountValue, mensualRateValueAsPercentage, catRate,
      catRateValueAsPercentage, catRateValueAsTruncated, annualRateValueAsPercentage, dispositionCommissionValue,
      dispositionCommissionValueAsAmount, installmentAmountValue, installmentAmountValueAsAmount, allowedTermsItems
    } = this.responseOperators.offerDetailOperator.processor;
    const aux = [
      {
        path: 'fullSummary.2.iconMessageTertiary.message',
        value: `<font size=4><strong>CAT ${this.removeLastZeroCatRateValue(catRateValueAsTruncated)} </font></strong>sin IVA. Tasa de interés promedio ponderada por saldo en términos anuales <strong>${annualRateValueAsPercentage}.</strong> Comisión por disposición del crédito para transferencia de saldo Banca Internet ${this.commisionDinamicAmount} sin IVA informativo. Fecha de cálculo ${moment(this.calculationDateDinamic).format('LL')}. Vigencia de la oferta ${moment(this.period).format('LL')}.`
      },

    ];
    aux.forEach(prop => this._dispatchEvent('set-step-instant-cash-property', prop));
    this._dispatchEvent('manage-first-step-summary-content', false);
    this.dispatchEvent(new CustomEvent('set-modal-selector-properties', {
      bubbles: true,
      composed: true,
      detail: allowedTermsItems
    }));
  }

  onFirstStepContinue() {
    this.showRecipient();
    this.goNextStep();
  }

  onAmountInputFocus() {
    this.validateFirstStep();
  }

  onAmountInputBlur(payload) {
    if (payload && payload.uiElementId) {
      this.userModifiedOperative = true;
      let {eventDetail: {amount, isValid}} = payload;
      this.currentSelectedAmount = amount;
      this.amountInputIsValid = isValid;
      this.validateFirstStep();
      if (this.amountInputIsValid
                  && typeof this.currentSelectedAmount === 'number'
                  && this.currentSelectedAmount !== this._lastValidAmountSelected
                  && this.currentSelectedAmount !== this.lastSimulatedAmount) {
        this._lastValidAmountSelected = this.currentSelectedAmount;
        this._isTermSimulation = false;
        this.getOfferSimulationHandlingAttempts();
      }
    }
  }

  onAmountInputBlurEmpty(payload) {
    this.userModifiedOperative = true;
    this.currentSelectedAmount = null;
    this.validateFirstStep();
  }

  onAmountChanged(payload) {
    if (payload.uiElementId) {
      this.userModifiedOperative = true;
      this.currentSelectedAmount = payload.eventDetail.value;
      this.validateFirstStep();
    }
  }

  performTermSimulation({term}) {
    const {allowedTermsItems} = this.responseOperators.offerDetailOperator.processor;
    this.currentSelectedTerm = term.number;
    if (this.currentSelectedTerm !== this.lastSimulatedTerm && this.currentSelectedTerm !== this._lastValidTermSelected) {
      this.userModifiedOperative = true;
      const isAnAllowedTerm = allowedTermsItems.map(({term: {number}}) => number).includes(this.currentSelectedTerm);
      if (isAnAllowedTerm) {
        this._lastValidTermSelected = this.currentSelectedTerm;
        this._isTermSimulation = true;
        this.getOfferSimulationHandlingAttempts();
      }
    }
  }

  getOfferSimulationHandlingAttempts() {
    this.performRequestHandlerSet(this.requestRetryHandlerSets.offerSimulationRequestRetryHandlerSet);
  }

  getOfferSimulation() {
    this.showSpinner();
    const {suggestedAmount, percentageToLoad, annualRate} = this.responseOperators.offerDetailOperator.processor;
    let requestBody = {
      term: this._lastValidTermSelected,
      terms: {
        frequency: 'MONTHLY',
        number: this._lastValidTermSelected
      },
      requestedAmount: {
        amount: this._lastValidAmountSelected,
        currency: suggestedAmount.currency
      },
      rates: [ annualRate ],
      fees: {
        itemizeFees: [ percentageToLoad ]
      }
    };
    this.$.dmApisCards.getOfferSimulation(requestBody);
  }

  onOfferSimulationSuccess(currentEvent) {
    this._secondaryText();
    this.operateResponse(currentEvent.detail, this.responseOperators.offerSimulationOperator);
    const {
      requestedTermValue, requestedAmountValue,
      mensualRateValueAsPercentage, catRateValueAsPercentage, catRateValueAsTruncated, annualRateValueAsPercentage,
      dispositionCommissionValueAsAmount, installmentAmountValue, installmentAmountValueAsAmount, dispositionCommissionValue
    } = this.responseOperators.offerSimulationOperator.processor;
    this.currentDispositionCommission = dispositionCommissionValue;
    this.lastSimulatedTerm = requestedTermValue;
    this.lastSimulatedAmount = requestedAmountValue;
    this.currentSelectedAmount = requestedAmountValue;
    this.amountInputIsValid = true;
    this.validateFirstStep();
    let propsToUpdate = [
      {
        path: 'filledSummary.0.keyValues.value.amount',
        value: this.lastSimulatedAmount
      },
      {
        path: 'filledSummary.1.keyValuesList.list.0.value',
        value: installmentAmountValueAsAmount
      },
      {
        path: 'filledSummary.1.keyValuesList.list.1.value',
        value: `${this.lastSimulatedTerm} meses`
      },
      {
        path: 'filledSummary.2.keyValuesList.list.0.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'filledSummary.2.keyValuesList.list.1.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'filledSummary.2.keyValuesList.list.2.value',
        value: catRateValueAsPercentage
      },
      {
        path: 'filledSummary.2.keyValuesList.list.3.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'filledSummary.2.keyValuesList.list.4.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'fullSummary.2.keyValuesList.list.0.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'fullSummary.2.keyValuesList.list.1.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'fullSummary.2.keyValuesList.list.2.value',
        value: this.removeLastZeroCatRateValue(catRateValueAsTruncated)
      },
      {
        path: 'fullSummary.2.keyValuesList.list.3.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'fullSummary.2.keyValuesList.list.4.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'stickySection.operation',
        value: {
          amount: {
            amount: installmentAmountValue,
            currency: this.localCurrency
          }
        }
      }
    ];
    if (!this._isTermSimulation) {
      propsToUpdate.push({
        path: 'fullSummary.0.validateAmountInput.setAmount',
        value: this.lastSimulatedAmount
      });
      propsToUpdate.push({
        path: 'fullSummary.0.validateAmountInput.amount',
        value: this.lastSimulatedAmount
      });
    } else {
      propsToUpdate.push({
        path: 'fullSummary.1.selectModal.selectedElement',
        value: `${this.lastSimulatedTerm} meses`
      });
    }
    propsToUpdate.forEach(prop => this._dispatchEvent('set-step-instant-cash-property', prop));
    this._dispatchEvent('analytics-persist-simulation-data', currentEvent.detail);
    this.saveDataOffers('offerSimulation');
    this.hideSpinner();
  }

  onOfferSimulationError(currentEvent) {
    this.hideSpinner();
    this.performResponseHandlerValidation(currentEvent.detail, this.responseHandlers.offerSimulationErrorHandler.handler);
  }

  validateFirstStep() {
    const isValid = !!this.currentSelectedTerm && !!this.currentSelectedAmount && this.amountInputIsValid;
    this._dispatchEvent('set-step-instant-cash-property', {
      path: 'isAValidStep',
      value: isValid
    });
    this._dispatchEvent('set-step-instant-cash-property', {
      path: 'stickySection.disabledPrimaryButton',
      value: !isValid
    });
  }

  onBackIntoFirstStep() {
    this.amountInputIsValid = true;
    this.hideRecipient();
    this.validateFirstStep();
  }

  handleAllowedTerms(allowedTerms) {
    return allowedTerms
      .filter(term => term.number > 0)
      .map((term, index) => ({
        id: index,
        name: `${term.number} meses`,
        term
      }));
  }

  hireInstantCashHandlingAttempts() {
    this.performRequestHandlerSet(this.requestRetryHandlerSets.offerHiringRequestRetryHandlerSet);
  }

  hireInstantCash() {
    this.showSpinner();
    const {percentageToLoad, annualRate, offerType} = this.responseOperators.offerDetailOperator.processor;
    const requestBody = {
      offerId: this.offerId,
      rates: [
        annualRate,
        {
          unit: {
            percentage: percentageToLoad.itemizeFeeUnit.percentage
          },
          mode: {
            id: percentageToLoad.mode.id
          },
          rateType: {
            name: percentageToLoad.name,
            id: percentageToLoad.feeType
          }
        }
      ],
      fees: {
        itemizeFees: [
          {
            itemizeFeeUnit: {
              import: {
                amount: this.currentDispositionCommission,
                currency: this.localCurrency
              }
            }
          }
        ]
      },
      requestedAmount: {
        currency: this.localCurrency,
        amount: this.lastSimulatedAmount
      },
      terms: {
        frequency: 'MONTHLY',
        number: this.lastSimulatedTerm
      },
      advanceType: offerType,
      receivingAccount: {
        numberType: {
          id: this.selectedDepositAccount.numberType.id
        },
        number: this.selectedDepositAccount.number,
        id: this.selectedDepositAccount.id
      }
    };
    this.$.dmApisCards.getCardCashAdvances(requestBody);
  }

  onOfferHiringSuccess(currentEvent) {
    this.operateResponse(currentEvent.detail, this.responseOperators.offerHiringOperator);
    const frontCardImage = this.c(this.associatedCard, 'detail.images').find(image => this.c(image, 'id') === 'FRONT_CARD');
    const {
      applyDate, operationNumber, receivingAccount, terms, catRate,
      catRateValueAsPercentage, catRateValueAsTruncated, annualRateValueAsPercentage, dispositionCommissionValue,
      dispositionCommissionValueAsAmount, requestedAmountValue, requestedAmountValueAsAmount,
      installmentAmountValueAsAmount, installmentAmountValue
    } = this.responseOperators.offerHiringOperator.processor;
    const {
      mensualRateValueAsPercentage
    } = this.responseOperators.offerDetailOperator.processor;
    const foundReceivingAccount = this.depositAccountsList.find(account => this.c(account, 'originalAccountPayload.id') === receivingAccount.id);
    this._dispatchEvent('analytics-persist-offer-hiring-success', currentEvent.detail);
    this._dispatchEvent('set-instant-cash-share-receipt-data', {
      additionalInfo: {
        annualInterest: annualRateValueAsPercentage,
        commissionWithoutVat: dispositionCommissionValueAsAmount,
        cat: this.removeLastZeroCatRateValue(catRateValueAsTruncated),
        term: `${terms.number} meses`,
        chargeAccount: `${this.c(this.associatedCard, 'alias')} - ${this.c(this.associatedCard, 'number').toString().slice(-4)}`,
        monthlyPaymentWithoutInterest: installmentAmountValueAsAmount,
      },
      aplicationDate: applyDate,
      localAmount: {
        amount: requestedAmountValue,
        currency: 'MXN',
      },
      operationType: 'instant-cash-successful-screen-share-receipt-operation-type',
      referenceFolio: operationNumber,
      templateSelected: 'instantCashDetail',
    });
    this._dispatchEvent('navigate-to-successful-screen', {
      title: 'instant-cash-successful-screen-title',
      date: applyDate,
      dateClass: 'bold-date',
      amountLabel: 'instant-cash-successful-screen-amount-label',
      chargeAmount: {
        amount: requestedAmountValue,
        currency: 'MXN',
        class: 'amount-huge-decimals'
      },
      chargeBottomAmount: {
        keyLabel: 'instant-cash-successful-screen-bottom-amount-label',
        class: 'spacing-top-s currency-xxxl',
        amount: installmentAmountValue,
        currency: 'MXN'

      },
      headerAmountList: [
        [
          {
            key: 'instant-cash-successful-screen-cat-rate-key',
            value: this.removeLastZeroCatRateValue(catRateValueAsTruncated),
            class: 'bold margin-m kill-amount-padding'
          },
          {
            key: 'instant-cash-successful-screen-annual-rate-key',
            value: annualRateValueAsPercentage,
            class: 'bold margin-m kill-amount-padding'
          },
          {
            key: 'instant-cash-successful-screen-disposition-commission-key',
            value: this.commisionDinamicAmount,
            class: 'margin-m kill-amount-padding'
          }
        ]
      ],
      origin: {
        avatar: {
          src: frontCardImage.url
        }
      },
      topInfo: [
        {
          value: this.c(this.associatedCard, 'alias'),
          class: 'bold md'
        },
        {
          musk: {
            value: this.c(this.associatedCard, 'number'),
            class: 'bold md',
            chars: 4,
            simbol: '·'
          }
        }
      ],
      additionalInfo: [
        {
          key: 'instant-cash-successful-screen-operation-type-key',
          value: 'Disposición de efectivo',
        },
        {
          value: 'Promoción Efectivo Inmediato',
          class: 'spacing',
        },
        {
          key: 'instant-cash-successful-screen-deposit-account-key',
          value: this.selectedDepositAccount.alias,
          class: 'spacing',
          musk: {
            value: this.selectedDepositAccount.number,
            chars: 4,
            simbol: '·'
          }
        },
        {
          class: 'spacing',
          key: 'instant-cash-successful-screen-term-key',
          value: `${terms.number} meses`
        },
        {
          key: 'instant-cash-successful-screen-folio-key',
          value: operationNumber,
          class: 'spacing'
        },
        {
          class: 'spacing',
          value: 'instant-cash-successful-screen-bbva-key'
        },
        {
          class: 'spacing',
          message: {
            icon: 'coronita:info',
            type: 'info-dark',
            text: 'instant-cash-successful-screen-icon-message',
            iconSize: {
              width: 20,
              height: 20
            }
          }
        },
        {
          class: 'spacing',
          message: {
            icon: 'coronita:info',
            type: 'info-dark',
            text: `${this.t('instant-cash-successful-screen-bottom-message')}<br><strong>${this._getContactEmail() || this.userEmail }</strong>`,
            iconSize: {
              width: 20,
              height: 20
            }
          }
        },
      ],
      operations: [
        {
          label: 'instant-cash-successful-screen-share-key',
          id: 'share',
          icon: 'coronita:share',
          height: this.totalHeight,
          share: true
        }
      ],
      buttons: {
        primary: {
          text: 'instant-cash-successful-screen-secondary-button-text',
          action: 'primary-button-clicked'
        },
        secondary: {
          hidden: true
        }
      }
    }
    );
    this._sendAppsFlyerInstantCash('exito_efi', {});
    this.hideSpinner();
    this.reset();
  }

  onOfferHiringError(currentEvent) {
    this.hideSpinner();
    this.performResponseHandlerValidation(currentEvent.detail, this.responseHandlers.offerHiringErrorHandler.handler);
    this._dispatchEvent('analytics-persist-offer-hiring-error', currentEvent.detail);
  }

  onDepositAccountSelected(selectedAccount) {
    this.selectedDepositAccount = selectedAccount.originalAccountPayload;
    this.goNextStep();
  }

  /**
  * @desc get customer detail for email
  */
  getCustomerDetail() {
    const customer = this.globalCacheStorage?.customer || this.customerId;
    this._dispatchEvent('set-customer-id', customer.customerId);
    this._dispatchEvent('request-customer-detail');
  }

  getInfoOffers(offers) {
    const offerInfo = offers.find(offer => offer.config.offerId === this.offerId);
    const params = {
      offerId: this.get('config.offerId', offerInfo) || this.offerId,
      cardId: this.get('config.product.contractId', offerInfo) || this.cardId,
      period: this.get('config.endDate', offerInfo) ||  this.period
    };
    this.handleInstantCashOfferFromListOffers(params);
  }

  /**
  * Sets the parameters for the instant cash component.
  * @param {Object} params - The parameters object.
  */
  setParams(params) {
    this.offerId = this.get('offerId', params);
    this.cardId = this.get('productId', params);
  }

  handleInstantCashOfferFromListOffers(offerPayload) {
    const { offerId, cardId, period } = offerPayload;
    this.offerId = offerId;
    this.cardId = cardId;
    this.period = period;

    const aux = [
      {
        path: 'fullSummary.3.keyValuesList.list.1.value',
        value: moment(this.period).format('LL')
      }
    ];
    aux.forEach(prop => this._dispatchEvent('set-step-instant-cash-property', prop));
    this.getOfferDetailHandlingAttempts();
  }

  getOfferDetailHandlingAttempts() {
    this.performRequestHandlerSet(this.requestRetryHandlerSets.offerDetailRequestRetryHandlerSet);
  }

  getOfferDetail() {
    this.showSpinner();
    this.$.dmApisCards.getOfferDetail();
  }

  onGetFinancialOverview() {
    this._dispatchEvent('set-timeout-show-tooltip', '3000');
    const contracts = this.c(this.financialOverview, 'data.contracts', []);
    this.associatedCard = contracts
      .find(product => this.c(product, 'subProductType.id') === 'CREDIT_CARD' && this.c(product, 'id') === this.cardId);
    const associatedCardAlias = this.c(this.associatedCard, 'product.name', '');
    const associatedCardNumber = this.c(this.associatedCard, 'number', '');
    const aux = [
      {
        path: 'cardAdvice.boldText',
        value: associatedCardAlias
      },
      {
        path: 'cardAdvice.cardNumber',
        value: associatedCardNumber
      }
    ];
    aux.forEach(prop => this._dispatchEvent('set-step-instant-cash-property', prop));
    const frontCardImage = this.c(this.associatedCard, 'detail.images', [])
      .find(image => this.c(image, 'id') === 'FRONT_CARD');
    const availableBalance = this.c(this.associatedCard, 'detail.specificAmounts', [])
      .find(specificAmount => this.c(specificAmount, 'id') === 'AVAILABLE_BALANCE');
    const availableBalanceAmountInLocalCurrency = this.c(availableBalance, 'amounts', [])
      .find(amount => this.c(amount, 'currency') === this.localCurrency);
    this._dispatchEvent('set-step-recipient-selector-properties', {
      recipientSelected: {
        name: associatedCardAlias,
        description: {
          value: associatedCardNumber,
          masked: true
        },
        primaryAmount: {
          amount: this.c(availableBalanceAmountInLocalCurrency, 'amount'),
          currency: this.localCurrency,
          label: 'Crédito disponible'
        },
        imgSrc: this.c(frontCardImage, 'url')
      }
    });
    this.depositAccountsList = contracts
      .reduce((acc, product) => {
        const productType = this.c(product, 'productType');
        const productId = this.c(product, 'product.id');
        if (productType === 'ACCOUNT' &&  ['AH', 'CH'].includes(productId)) {
          const alias = this.c(product, 'alias', '');
          const accountNumber = this.c(product, 'number', '');
          const specificAmounts = this.c(product, 'detail.specificAmounts', []);
          const currentBalance = specificAmounts
            .find(specificAmount => this.c(specificAmount, 'id') === 'CURRENT_BALANCE');
          const currentBalanceAmountInLocalCurrency = this.c(currentBalance, 'amounts', [])
            .find(amount => this.c(amount, 'currency') === this.localCurrency);
          if (currentBalanceAmountInLocalCurrency) {
            acc.push({
              name: alias,
              description: {
                value: accountNumber,
                masked: true
              },
              primaryAmount: {
                amount: this.c(currentBalanceAmountInLocalCurrency, 'amount'),
                currency: this.localCurrency,
                label: 'Saldo disponible'
              },
              originalAccountPayload: product
            });
          }
        }
        return acc;
      }, []);

    const descriptionContent = this.depositAccountsList.length === 1 ?  this.t('instant-cash-step-product-selector-description-one-account') : this.t('instant-cash-step-product-selector-description-more-accounts');

    this._dispatchEvent('set-step-product-selector-properties', {
      description: descriptionContent,
      productsListLabel: 'CUENTAS',
      products: this.depositAccountsList
    });
  }

  onOfferDetailSuccess(currentEvent) {
    this._secondaryText();
    this.operateResponse(currentEvent.detail, this.responseOperators.offerDetailOperator);
    const {
      minimumAmountValue, maximumAmountValue, maximumAmountValueAsAmount, suggestedTermValue,
      suggestedAmountValue, suggestedAmountValueAsAmount, mensualRateValueAsPercentage, catRate,
      catRateValueAsPercentage, catRateValueAsTruncated, annualRateValueAsPercentage, dispositionCommissionValue,
      dispositionCommissionValueAsAmount, installmentAmountValue, installmentAmountValueAsAmount, allowedTermsItems
    } = this.responseOperators.offerDetailOperator.processor;

    const changeFormatMaximumAmountValue = this._getFormattedExec(maximumAmountValue, this.localCurrency).slice(0, -1);
    this.currentDispositionCommission = dispositionCommissionValue;
    this.currentSelectedTerm = suggestedTermValue;
    this._lastValidTermSelected = suggestedTermValue;
    this.lastSimulatedTerm = suggestedTermValue;
    this.currentSelectedAmount = suggestedAmountValue;
    this._lastValidAmountSelected = suggestedAmountValue;
    this.lastSimulatedAmount = suggestedAmountValue;
    this.amountInputIsValid = true;
    this.validateFirstStep();

    const allowedTermsAsRange = allowedTermsItems.map(({term: {number}}) => number);
    const minTerm = Math.min(...allowedTermsAsRange);
    const maxTerm = Math.max(...allowedTermsAsRange);
    const aux = [
      {
        path: 'cardAdvice.text',
        value: this.t('instant-cash-first-step-card-advice-description', '', {
          maxAmount: changeFormatMaximumAmountValue
        })
      },
      {
        path: 'cardAdvice.listInfo.1',
        value: this.t('instant-cash-first-step-features-second-feature', '', {
          minTerm,
          maxTerm,
          termFrecuency: 'meses'
        })
      },
      {
        path: 'filledSummary.0.keyValues.value.amount',
        value: suggestedAmountValue
      },
      {
        path: 'filledSummary.1.keyValuesList.list.0.value',
        value: installmentAmountValueAsAmount
      },
      {
        path: 'filledSummary.1.keyValuesList.list.1.value',
        value: `${suggestedTermValue} meses`
      },
      {
        path: 'filledSummary.2.keyValuesList.list.0.value',
        value: catRateValueAsPercentage
      },
      {
        path: 'filledSummary.2.keyValuesList.list.1.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'filledSummary.2.keyValuesList.list.2.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'filledSummary.2.keyValuesList.list.3.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'filledSummary.2.keyValuesList.list.4.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'fullSummary.0.validateAmountInput.setAmount',
        value: suggestedAmountValue
      },
      {
        path: 'fullSummary.0.validateAmountInput.amount',
        value: suggestedAmountValue
      },
      {
        path: 'fullSummary.0.validateAmountInput.max',
        value: suggestedAmountValue
      },
      {
        path: 'fullSummary.0.validateAmountInput.min',
        value: 100
      },
      {
        path: 'fullSummary.1.selectModal.selectedElement',
        value: `${suggestedTermValue} meses`
      },
      {
        path: 'fullSummary.2.keyValuesList.list.0.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'fullSummary.2.keyValuesList.list.1.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'fullSummary.2.keyValuesList.list.2.value',
        value: this.removeLastZeroCatRateValue(catRateValueAsTruncated),
      },
      {
        path: 'fullSummary.2.keyValuesList.list.3.value',
        value: annualRateValueAsPercentage
      },
      {
        path: 'fullSummary.2.keyValuesList.list.4.value',
        value: dispositionCommissionValueAsAmount
      },
      {
        path: 'fullSummary.3.keyValuesList.list.0.value',
        value: moment(catRate.calculationDate).format('LL')
      },
      {
        path: 'stickySection.operation',
        value: {
          amount: {
            amount: installmentAmountValue,
            currency: this.localCurrency
          }
        }
      }
    ];
    aux.forEach(prop => this._dispatchEvent('set-step-instant-cash-property', prop));
    this._dispatchEvent('manage-first-step-summary-content', false);
    this._dispatchEvent('analytics-persist-simulation-data', currentEvent.detail);
    this.dispatchEvent(new CustomEvent('set-modal-selector-properties', {
      bubbles: true,
      composed: true,
      detail: allowedTermsItems
    }));
    this.saveDataOffers('offerDetails');
    this.hideSpinner();

  }

  onOfferDetailError(currentEvent) {
    this.hideSpinner();
    this.performResponseHandlerValidation(currentEvent.detail, this.responseHandlers.offerDetailErrorHandler.handler);
  }

  onHeaderCategoryHelpIconClicked(currentEvent) {
    if (currentEvent && currentEvent.uiElementId === 'taxes-and-commissions-section') {
      this._openModal(this.uiTemplates.taxesAndCommissionsModal);
    }
  }

  onKeyValueHelpIconClicked(currentEvent) {
    if (currentEvent && currentEvent.uiElementId === 'taxes-and-commissions-section') {
      const {eventDetail: {id: keyValueId}} = currentEvent;
      let targetModalTemplate;
      switch (keyValueId) {
        case 'cat-rate':
          targetModalTemplate = this.uiTemplates.catRateModal;
          break;
        case 'monthly-rate':
          targetModalTemplate = this.uiTemplates.monthlyRateModal;
          break;
        case 'annual-rate':
          targetModalTemplate = this.uiTemplates.annualRateModal;
          break;
        case 'annual-rate-by-simulation':
          targetModalTemplate = this.uiTemplates.annualRateBySimulationModal;
          break;
        case 'disposition-commission':
          targetModalTemplate = this.uiTemplates.dispositionCommissionModal;
          break;
      }
      this._openModal(targetModalTemplate);
    }
  }

  showSpinner() {
    this._dispatchEvent('show-spinner');
  }

  hideSpinner() {
    this._dispatchEvent('hide-spinner');
  }

  /**
  * Goes to next step collapsing current one.
  */
  goNextStep() {
    this._steps[this.currentStep].collapsed = true;
    this._nextStep();
    if (this.currentStep === 2) {
      this._sendAppsFlyerInstantCash('tyc_efi', {});
    } else if (this.currentStep === 3) {
      this._sendAppsFlyerInstantCash('confirma_efi', {});
    }
  }

  goToStep(step) {
    const stepToNavigate = this._steps[step.currentStep];
    if (stepToNavigate) {
      stepToNavigate.collapsed = false;
      this.toggleCollapsedView(stepToNavigate);
      this._activateSteps(stepToNavigate);
    }
  }

  /**
  * Set data and open the confirm modal
  */
  openConfirmModal() {
    this._openModal(this.uiTemplates.confirmModal);
  }

  openOperationNotPerformedErrorModal() {
    this._openModal(this.uiTemplates.operationNotPerformedErrorModal);
    this._dispatchEvent('analytics-offer-fingerprint-error');
  }

  openInformationNotAvailableErrorModal() {
    this._openModal(this.uiTemplates.informationNotAvailableErrorModal);
  }

  openInformationNotAvailableRetryModal() {
    this._openModal(this.uiTemplates.unavailableOfferErrorModal);
    this._dispatchEvent('analytics-offer-fingerprint-error');
  }

  openOperationNotPerformedRetryModal() {
    this._openModal(this.uiTemplates.operationNotPerformedRetryModal);
    this._dispatchEvent('analytics-persist-offer-hiring-error');
  }

  openCardIssuesErrorModal() {
    this._openModal(this.uiTemplates.cardIssuesErrorModal);
    this._dispatchEvent('analytics-persist-offer-hiring-error');
  }

  openExpiredCardErrorModal() {
    this._openModal(this.uiTemplates.expiredCardErrorModal);
    this._dispatchEvent('analytics-persist-offer-hiring-error');
  }

  openAmountExceedsDepositLimitErrorModal() {
    this._openModal(this.uiTemplates.amountExceedsDepositLimitErrorModal);
    this._dispatchEvent('analytics-persist-offer-hiring-error');
  }

  openOfferTakenErrorModal() {
    this._openModal(this.uiTemplates.offerTakenErrorModal);
    this._dispatchEvent('analytics-offer-fingerprint-error');
  }

  openUnavailableOfferErrorModal() {
    this._openModal(this.uiTemplates.unavailableOfferErrorModal);
    this._dispatchEvent('analytics-offer-fingerprint-error');
  }
}

customElements.define(GlomoOpxInstantCashMxDm.is, GlomoOpxInstantCashMxDm);
