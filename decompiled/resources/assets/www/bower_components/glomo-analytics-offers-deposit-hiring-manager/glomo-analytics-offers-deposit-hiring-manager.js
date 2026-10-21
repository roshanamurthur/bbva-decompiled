/*eslint new-cap: 0*/
class GlomoAnalyticsOffersDepositHiringManager extends Polymer.mixinBehaviors([
  CellsBehaviors.CellsCheckNestedKeysBehavior, CellsBehaviors.i18nBehavior],
CellsBehaviors.GlomoAnalyticsManagerMixin(CellsBehaviors.GlomoAnalyticsManagerMixinStep(Polymer.Element))) {
  static get is() {
    return 'glomo-analytics-offers-deposit-hiring-manager';
  }

  static get properties() {
    return {
      /** @desc flag that indicate if all step was collapse @type {Boolean} */
      isAllStepCollapsed: {
        type: Boolean,
        value: false
      },
      /** @desc step to launch the analytics @type {String} */
      step: {
        type: String,
        value: ''
      },
      /** @desc step to first interaction @type {Boolean} */
      firstInteract: {
        type: Boolean,
        value: false
      },
      /** @desc flag that determines if page is visited for first time @type {Boolean} */
      firedPageVisit: {
        type: Boolean,
        value: false
      },
      /** @desc dinamic step info @type {Object} */
      analyticsInfo: {
        type: Object,
        value: () => ({})
      },
      /** @desc option instructions select @type {Array} */
      instrucctionSelected: {
        type: Array,
        value: [
          'renovar inversion con ganancias',
          'renovar inversion sin ganancias',
          'sin renovacion automatica'
        ]
      },
      /** @desc ReGex for step success @type {String} */
      _regEx: {
        type: String,
        value: '[\u0300-\u036f]'
      },
      /**
       * Current call me back step
       * @type {Number}
       */
      cmbStep: {
        type: Number,
        value: 1
      },
      /** @desc flag for data promotion code
       * @type {String}
       * @default false
       */
      proccess: {
        type: Boolean,
        value: false
      },
      /**
       * Signature types dictionary
       * @type {Object}
      */
      signatureTypes: {
        type: Object,
        value: () => ({})
      },
      /**
       * Modal codes dictionary
       * @type {Object}
       */
      modalCodes: {
        type: Object,
        value: () => ({})
      }
    };
  }

  /**
  * @event deposit-hiring-reset-steps reset steps
  */
  reset() {
    this.dispatchEvent(new CustomEvent('deposit-hiring-reset-steps', {bubbles: true, composed: true}));
    this.firstInteract = false;
    this.firedPageVisit = false;
  }

  /**
  * @desc method that triggers AppPageVisit analytics
  * @param {Object} payload that is my value for application step
  */
  AppPageVisit(payload) {
    if (!this.firedPageVisit) {
      const dataProv = {
        isQualifiedVisits: 'true',
        applicationStep: '1 simulacion'
      };
      this.analyticsInfo = {
        ...this.analyticsInfo,
        ...dataProv
      };
      const data = this._offerInfo(payload);
      this._dispatch('app-visit', {...data, ...dataProv});
      this.firePageVisit();
      this.firedPageVisit = true;
    }
  }
  /**
  * @desc method that checks for a step change
  * @param {Element} evt is an element HTML that is the current step
  */
  changeStep(evt) {
    if (!this.isAllStepCollapsed) {
      if (parseInt(evt.currentStep) === 1) {
        this.firePageVisit();
      } else {
        let payload = 'app-step-' + evt.currentStep;
        this.step = payload;
        this.dispatchEvent(new CustomEvent('app-step', {
          detail: payload,
          bubbles: true,
          composed: true
        }));
      }
    } else {
      let payload = 'app-step-5';
      this.dispatchEvent(new CustomEvent('app-step-5', {
        bubbles: true,
        composed: true,
        detail: payload
      }));
    }
  }

  /**
  * @desc Method that validates whether a user has a promotion code
  * @param {Object} payload object receiving analytics
  */
  _offerInfo(payload) {
    return this.proccess ? { ...payload, applicationProcess: 'cliente con codigo' } : { ...payload, applicationProcess: 'cliente sin codigo' };
  }

  /**
  * @desc method that triggers dispatchAnalityc analytics
  * @param {Object} payload that is my value for application step
  */
  dispatchAnalityc(payload) {
    const data = this._offerInfo(payload);
    this.dispatchEvent(new CustomEvent(this.step, {
      bubbles: true,
      composed: true,
      detail: data
    }));
  }

  /**
  * @desc method that triggers dispatStepFive analytics
  * @param {Object} payload that is my value for application step
  */
  dispatStepFive(payload) {
    const data = this._offerInfo(payload);
    this.dispatchEvent(new CustomEvent('app-step-5-analytic', {
      bubbles: true,
      composed: true,
      detail: data
    }));
  }

  /**
   * Dispatch event analytics-otp
   * @event analytics-otp
   */
  openSign(payload) {
    this.analyticsInfo = {
      ...this.analyticsInfo,
      applicationCustomFields: `firma:${this.signatureTypes[this.get('signatureType', payload)]}`,
      pageInfoLevel3: '6 otp',
      applicationStep: '6 otp'
    };
    if (Object.keys(this.signatureTypes).length) {
      this.dispatStepSix(payload);
    }
  }

  /**
  * @desc method that triggers dispatStepSix analytics
  * @param {Object} payload that is my value for application step
  */
  dispatStepSix(payload) {
    const data = this._offerInfo(payload);
    this.dispatchEvent(new CustomEvent('app-step-6', {
      bubbles: true,
      composed: true,
      detail: {
        ...data,
        ...this.analyticsInfo
      }
    }));
    this.dispatchEvent(new CustomEvent('parse-deposit-hiring-to-receipt', {
      bubbles: true,
      composed: true,
      detail: this.analyticsInfo
    }));
  }

  /**
  * @desc method that triggers dispatchCompleteSuccess analytics
  * @param {Object} payload that is my value for application step
  */
  dispatchCompleteSuccess(payload) {
    const data = this._offerInfo(payload);
    this.dispatchEvent(new CustomEvent('app-page-completed-success-analytics', {
      bubbles: true,
      composed: true,
      detail: data
    }));
  }

  /**
  * @desc method that triggers dispatchInProccessSuccess analytics
  * @param {Object} payload that is my value for application step
  */
  dispatchInProccessSuccess(payload) {
    const data = this._offerInfo(payload);
    this.dispatchEvent(new CustomEvent('app-page-in-process-success-analytics', {
      bubbles: true,
      composed: true,
      detail: data
    }));
  }

  /**
  * @desc method that triggers dispatchCompleteError analytics
  * @param {Object} payload that is my value for application step
  */
  dispatchCompleteError(payload) {
    this.dispatchEvent(new CustomEvent('app-page-completed-error-analytics', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that triggers dispatchErrorOutTime analytics
  * @param {Object} payload that is my value for application step
  */
  dispatchErrorOutTime(payload) {
    this.dispatchEvent(new CustomEvent('modal-error-operation-out-time-analytics', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that triggers dispatchErrorParticipants analytics
  * @param {Object} payload that is my value for application step
  */
  dispatchErrorParticipants(payload) {
    this.dispatchEvent(new CustomEvent('modal-error-operation-participants-analytics', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that fire app started
  * @param {String} step that is my value for application step
  */
  fireAppStarted(payload) {
    this.dispatchEvent(new CustomEvent('app-started', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that fire app started
  */
  changeAmount() {
    this._numberInteraction('cantidad');
  }

  /**
  * @desc method that fire app started
  */
  changeSlider() {
    this._numberInteraction('plazo');
  }

  /**
  * @desc method that fire app started
  */
  changeOfferPressed() {
    this._numberInteraction('continuar');
  }

  /**
  * @desc method that fire app started
  * @param {Number} payload value for index position
  */
  changeModal(payload) {
    const pageInfoLevelDataStep = {
      0: 'info gat nominal',
      1: 'info gat real'
    };
    const translateToApplicationStep = {
      'info gat nominal': 'gat nominal',
      'info gat real': 'gat real',
      'info promocion unica': 'codigo de promocion'
    };
    const dataAplicationStep = pageInfoLevelDataStep[payload] ?? 'info promocion unica';
    const dataPageInfoLevel3 = translateToApplicationStep[dataAplicationStep];
    if (!this.firstInteract) {
      this._numberInteraction(dataAplicationStep);
    }
    this.dispatchEvent(new CustomEvent('change-modal-info', {
      bubbles: true,
      composed: true,
      detail: {
        pageInfoLevel3: dataPageInfoLevel3
      }
    }));
  }

  /**
   * @desc method that fire page view modal info analytics
   * @param {Number} payload
   */
  changeInstructionHelpModal(payload) {
    const payloadConfig = {
      0: 'renovar con ganancias',
      1: 'renovar sin ganancias',
      2: 'sin renovacion automatica'
    };
    const data = payloadConfig[this.get('id', payload)];
    this.dispatchEvent(new CustomEvent('change-instruction-modal', {
      bubbles: true,
      composed: true,
      detail: {
        pageInfoLevel3: data
      }
    }));
  }

  /**
   * @desc method that fire page view modal info ipab analytics
   */
  modalInfoIpabModal() {
    this.dispatchEvent(new CustomEvent('modal-info-ipab-modal', {
      bubbles: true,
      composed: true,
      detail: {
        pageInfoLevel3: 'ipab'
      }
    }));
  }

  /**
  * @desc method common for fire app started
  * @param {Object} payload value for operative
  */
  _numberInteraction(payload) {
    const data = this._offerInfo(payload);
    if (!this.firstInteract) {
      this.firstInteract = true;
      this.dispatchEvent(new CustomEvent('app-started', {
        bubbles: true,
        composed: true,
        detail: {
          ...data,
          applicationStep: payload
        }
      }));
    }
  }

  /**
  * @desc method get info simulate
  * @param {Object} payload value for analyticsInfo
  */
  setDepositInfoSimulate(payload) {
    this.analyticsInfo = {
      applicationTerm: payload?.responseData?.terms?.number?.toString() || '',
      applicationInterestRate: payload?.responseData.annualRate || '',
      applicationAmount: payload?.responseData?.initialAmount[0]?.amount?.toString() || '',
      applicationCurrency: payload?.responseData?.initialAmount[0]?.currency?.toLowerCase() || '',
      applicationInstruction: this.instrucctionSelected[payload?.radioSelected || 0]
    };
  }

  /**
  * @desc method send info for Step
  * @param {Number} step value position Step
  */
  dispatchStepEvent(step) {
    if (step && typeof step === 'number') {
      const steps = {
        2: '2 cuenta deposito',
        3: '3 instruccion al vencimiento',
        4: '4 terminos y condiciones'
      };
      const currentStep = steps[step];
      this._dispatchStepData(
        {applicationStep: currentStep, pageInfoLevel3: currentStep},
        step
      );
    }
  }

  /**
   * @desc Dispatch the hiring confirmation step data
   * @param {Boolean} canExecute
   * @event app-step-5
   */
  dispatchHiringConfirmationStep(canExecute = false) {
    if (canExecute) {
      this._dispatchStepData(
        {applicationStep: '5 confirmar', pageInfoLevel3: '5 confirmar'},
        '5'
      );
    }
  }

  /**
   * @desc Dispatch the step data
   * @param {Object} data
   * @param {String} step
   * @event app-step-*
   */
  _dispatchStepData(data, step) {
    const offerInfoData = this._offerInfo();
    this.analyticsInfo = {
      ...this.analyticsInfo,
      ...data
    };
    this._dispatch(`app-step-${step}`, {
      ...offerInfoData,
      ...this.analyticsInfo,
    });
  }

  /**
  * @desc method for value selected in operative
  * @param {Object} payload values for radioSelected
  */
  setDepositInfoTypology(payload) {
    this.analyticsInfo = {
      ...this.analyticsInfo,
      applicationInstruction: this.instrucctionSelected[this.c(payload, ['radioSelected', 'index'], 0)]
    };
  }

  /**
  * @desc method send analytic step Otp
  */
  dispatStepSixGlobal() {
    this.dispatStepSix(this.analyticsInfo);
  }

  /**
   * @desc checks if all steps were collapse, and set my global flag
   * @param {Boolean} allStepCollapsed is a boolean that indicate if all steps were collapse or not
   */
  setAllStepCollapsed(allStepCollapsed) {
    this.isAllStepCollapsed = allStepCollapsed;
  }

  /**
   *@desc method to validate success event  on time or out of time
   *@param {Object} payload contain data for analytics detail
   */
  fireAnalyticsGlobalComplete(payload) {
    const customFields =  this.get('applicationCustomFields', this.analyticsInfo);
    const title = 'Compra en proceso';
    const dataCuoupon = this._offerInfo();
    const data = payload.title.includes(title) ? { event: 'app-inprocess', operationNumber: this.c(payload, 'topInfo.8.value', '')} : { event: 'app-completed', operationNumber: this.c(payload, 'topInfo.9.value', '')};
    this.dispatchEvent(new CustomEvent(`${data.event}-analytics`, {
      bubbles: true,
      composed: true,
      detail: {
        applicationAmount: this.c(payload, 'headerAdditionalListInfo.0.value.amount', '').toString(),
        applicationCurrency: this.c(payload, 'headerAdditionalListInfo.0.value.currencyCode', '').toLowerCase(),
        applicationTerm: this.c(payload, 'topInfo.2.value', '').split(' ')[0].toString(),
        applicationInterestRate: this.c(payload, 'headerAdditionalListInfo.1.value', '').split('%')[0].toString(),
        applicationInstruction: this.c(payload, 'topInfo.4.value', '').normalize('NFD').replace(RegExp(this._regEx, 'g'), '').toLowerCase(),
        applicationOperationNumber: data.operationNumber.toString(),
        applicationCustomFields: customFields,
        ...dataCuoupon
      }
    }));
  }

  /**
  * @desc method that triggers pageView HasContract analytics
  * @param {Object} payload that is my value for application step
  */
  huellaHasContract(payload) {
    this.dispatchEvent(new CustomEvent('huella-has-contract', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that triggers pageView LisContract analytics
  * @param {Object} payload that is my value for application step
  */
  huellaListContract(payload) {
    this.dispatchEvent(new CustomEvent('huella-contract-list', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that triggers internalLink analytics for newPayment
  * @param {Object} payload that is my value for application step
  */
  newPaymentLink(payload) {
    this.dispatchEvent(new CustomEvent('new-payment-link', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that triggers internalLink analytics for newContract
  * @param {Object} payload that is my value for application step
  */
  openNewContractLink(payload) {
    this.dispatchEvent(new CustomEvent('open-new-contract-link', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that triggers pageView InvalidContract analytics
  * @param {Object} payload that is my value for application step
  */
  huellaInvalidContract(payload) {
    this.dispatchEvent(new CustomEvent('huella-invalid-contract', {
      bubbles: true,
      composed: true,
      detail: payload
    }));
  }

  /**
  * @desc method that dispatch click to call analytics header in current step
  * @event send-analitycs-click-to-call-from-sticky-step-${this.cmbStep}
  */
  requestCallMeBackFromHeader() {
    this.dispatchEvent(new CustomEvent(`send-analitycs-click-to-call-from-header-step-${this.cmbStep}`, {
      bubbles: true,
      composed: true
    }));
  }

  /**
  * @desc method that dispatch click to call analytics sticky in current step
  * @event send-analitycs-click-to-call-from-sticky-step-${this.cmbStep}
  */
  requestCallMeBackFromSticky() {
    this.dispatchEvent(new CustomEvent(`send-analitycs-click-to-call-from-sticky-step-${this.cmbStep}`, {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * @desc method that dispatch pageView alert manager analytics
   * @param {Object} modalSettings
   */
  firePageView(modalSettings) {
    const {code} = modalSettings;
    const pageViewData = this.modalCodes[code];
    if (pageViewData) {
      pageViewData.pageInfoErrorPage = pageViewData?.isPageError ? pageViewData?.pageInfoLevel3 : '';
      this._fireEvent('dispatch-dynamic-page-view', pageViewData);
    }
  }

  /**
   * @desc Dispatches a custom event with name an detail
   * @param {String} eventName
   * @param {any} detail
   */
  _fireEvent(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail
    }));
  }
}
customElements.define(GlomoAnalyticsOffersDepositHiringManager.is, GlomoAnalyticsOffersDepositHiringManager);
