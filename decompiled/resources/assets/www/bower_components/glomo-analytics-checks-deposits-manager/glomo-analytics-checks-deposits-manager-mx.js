/* global GlomoAnalyticsChecksDepositsManagerMixin */
/* eslint-disable new-cap */
class GlomoAnalyticsChecksDepositsManagerMx extends GlomoAnalyticsChecksDepositsManagerMixin.mixin(Polymer.mixinBehaviors(
  [ CellsBehaviors.i18nBehavior ],
  CellsBehaviors.GlomoAnalyticsManagerMixin(CellsBehaviors.GlomoAnalyticsManagerMixinStep(Polymer.Element)))) {

  static get is() {
    return 'glomo-analytics-checks-deposits-manager-mx';
  }

  static get properties() {
    return {
      /**
       *  Photos/pictures  list
       *  @type Array
       */
      analyticsPhotosList: {
        type: Array,
        value: () => []
      }
    };
  }

  static get observers() {
    return [
      '_setAlayticsPhotosListInfoObserver(analyticsPhotosList.*)'
    ];
  }

  /**
   * Method that resets the value of the properties
   */
  analyticsReset() {
    this.set('analyticsPhotosList', []);
    let dataAnalytic = Object.assign({}, this.data);
    dataAnalytic.account[0].amount = '';
    dataAnalytic.account[0].currency = '';
    this.persistData(dataAnalytic);
    this._amountDetailReset();
  }

  /**
   * the amount of persist Data is reset
   */
  _amountDetailReset() {
    const amount = '';
    const currency = '';
    this.persistData({amount, currency});
  }

  _accountObserver(account) {
    if (account.value) {
      let dataAnalytic = {
        'account': [ {
          'amount': '',
          'currency': '',
          'primaryCategory': this.accounts
        } ]
      };
      this.persistData(dataAnalytic);
      this._dispatch('analytics-app-started', this.data);
    }
  }

  /**
   * Analytic photos list
   * @event analytics-photos-list
   */
  _setAlayticsPhotosListInfoObserver(photosList) {
    const photosListValue = photosList?.value;
    if (photosListValue) {
      this._dispatch('analytics-photos-list', photosListValue);
    }
  }

  /**
   * Analytic page visit
   * @event analytics-app-page-visit
   */
  sendAnalyticAppPageVisit() {
    if (this.analyticsPhotosList.length) {
      this.sendAnalyticsAppStep10();
    } else {
      this._dispatch('analytics-app-page-visit', this.data);
    }
  }

  /**
   * Analytic App Started
   * @event analytics-app-started
   */
  sendAnalyticAppStarted() {
    this._dispatch('analytics-app-started', this.data);
  }

  /**
   * Analytic App Started
   * @event analytics-app-started-info-modal
   */
  sendAnalyticAppStartedInfoModal() {
    this._dispatch('analytics-app-started-info-modal', this.data);
  }

  /**
   * Analytic On Click Start
   * @event analytics-on-click-start
   */
  sendAnalyticOnClickStart() {
    this._dispatch('analytics-on-click-start', this.data);
  }

  /**
   * Analytic Limit Operations Exceeded
   * @event analytics-limit-operations-exceeded
   */
  sendAnalyticLimitOperationsExceeded() {
    this._dispatch('analytics-limit-operations-exceeded', this.data);
  }

  /**
   * Analytic Make Operation Check Error
   * @event analytics-make-operation-check-error
   */
  sendAnalyticMakeOperationCheckError() {
    this._dispatch('analytics-make-operation-check-error', this.data);
  }

  /**
   * Analytic app step 3
   * @event analytics-app-step-3
   */
  sendAnalyticsAppStep3() {
    this._dispatch('analytics-app-step-3', this.data);
  }

  /**
   * Analytic app step 4
   * @event analytics-app-step-4
   */
  sendAnalyticsAppStep4() {
    this._dispatch('analytics-app-step-4', this.data);
  }

  /**
   * Analytic app step 5
   * @event analytics-app-step-5
   */
  sendAnalyticsAppStep5() {
    this._dispatch('analytics-app-step-5', this.data);
  }

  /**
   * Analytic app step 6
   * @event analytics-app-step-6
   */
  sendAnalyticsAppStep6() {
    this._dispatch('analytics-app-step-6', this.data);
  }

  /**
   * Analytic app step 7
   * @event analytics-app-step-7
   */
  sendAnalyticsAppStep7() {
    this._dispatch('analytics-app-step-7', this.data);
  }

  /**
   * Analytic app step 8
   * @event analytics-app-step-8
   */
  sendAnalyticsAppStep8() {
    this._dispatch('analytics-app-step-8', this.data);
  }

  /**
   * Analytic app step 9
   * @event analytics-app-step-9
   */
  sendAnalyticsAppStep9() {
    this._dispatch('analytics-app-step-9', this.data);
  }

  /**
   * Analytic app step 10
   * @event analytics-app-step-10
   */
  sendAnalyticsAppStep10() {
    this._dispatch('analytics-app-step-10', this.data);
  }

  /**
   * Analytic app step 11
   * @event analytics-app-step-11
   */
  sendAnalyticsAppStep11(detail) {
    const amount = this.get('amount', detail);
    const currency = this.get('currency', detail);
    this.persistData({amount, currency});

    this._dispatch('analytics-app-step-11', this.data);
  }

  /**
   * Analytic app step 12
   * @event analytics-app-step-12
   */
  sendAnalyticsAppStep12() {
    this._dispatch('analytics-app-step-12', this.data);
  }

  /**
   * Send event for analytic when the operative is completed
   * @event analytics-app-complete
   */
  sendAnalyticsComplete(detail) {
    const operationNumber = this.c(detail, 'id', '');
    const amount = this.c(detail, 'chargeAmount.amount', '');
    const currency = this.c(detail, 'chargeAmount.currency', '');
    this.persistData({amount, currency, operationNumber});

    this._dispatch('analytics-app-complete', this.data);
  }

  /**
   * Analytic huella errors
   * @param {String} errorCode
   */
  sendAnalyticsHuellaErrors(errorCode) {
    if (errorCode) {
      const errorCodeName = errorCode.replace(/([A-Z])/g, '-$1').toLowerCase();
      this._dispatch(`analytics-error-${errorCodeName}`);
    }
  }
}

customElements.define(GlomoAnalyticsChecksDepositsManagerMx.is, GlomoAnalyticsChecksDepositsManagerMx);
