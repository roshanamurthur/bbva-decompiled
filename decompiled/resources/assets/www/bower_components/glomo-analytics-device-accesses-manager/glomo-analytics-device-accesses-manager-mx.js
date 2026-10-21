/*eslint new-cap: [2, {"capIsNewExceptions": ["GlomoAnalyticsManagerMixin"]}]*/
class GlomoAnalyticsDeviceAccessesManagerMx extends CellsBehaviors.GlomoAnalyticsManagerMixin(Polymer.Element) {

  static get is() {
    return 'glomo-analytics-device-accesses-manager-mx';
  }

  static get properties() {
    return {
      /**
       * Object to be sent to analytics
       * @type {Object}
       */
      deviceAccessAnalytics: {
        type: Object,
        value: () => ({
          step: '',
          typology: '',
          linkUrl: '',
          process: ''
        })
      },
      /**
       * Dynamic typology values for analytics
       * @type {Object}
       */
      typologyData: {
        type: Object,
        value: () => ({
          ivr: 'verificacion por llamada',
          biometric: 'verificacion por huella facial',
          ivrBiometric: 'verificacion doble',
          card: 'reactivacion tarjeta',
          monoproduct: 'reactivacion monoproducto'
        })
      },
      /**
       * dynamic step values for analytics
       * @type {Object}
       */
      stepData: {
        type: Object,
        value: () => ({
          stepFocus: 'ingresar tdc manual',
          stepCamera: 'camara',
          stepIvr: '2 solicitud de llamada',
          stepBiometric: '2 solicitud de huella facial',
          stepIdentificate: 'identificate sin tarjeta o cuenta',
          stepHighestActivationToken: '3 activacion mas alta token',
          stepHighestToken: '3 alta token',
          stepSubstitutionToken: '3 sustitucion token'
        })
      },
      /**
       * dynamic linkUrl values for analytics
       * @type {Object}
       */
      linkUrlData: {
        type: Object,
        value: () => ({
          haveQR: 'tengo un qr',
          notHaveQr: 'no tengo un qr'
        })
      },
      /**
       * Counters to control the triggering of events
       * @type {Object}
       */
      hasStarted: {
        type: Object,
        value: () => ({
          counter: 0,
        })
      },
      /**
       * @description String value that will define the typology type
       * @type {String}
       */
      typeFlow: {
        type: String,
        notify: true
      }
    };
  }

  static get observers() {
    return [
      '_setTypology(typeFlow)'
    ];
  }

  /**
   * @description Set data in property deviceAccessAnalytics for typology
   * @param { String } typeFlow
   */
  _setTypology(typeFlow) {
    return this.deviceAccessAnalytics.typology = typeFlow === 'nonAccountClient' ? this.typologyData.monoproduct : this.typologyData.card;
  }

  /**
   * Reset values
   */
  resetAnalytics() {
    this.hasStarted.counter = 0;
  }

  /**
   * Fire event for appPageVisit
   * @event device-access-analytic-app-page-visit
   */
  appPageVisit() {
    this._dataDeviceAccessAnalytics('device-access-analytic-app-page-visit');
  }

  /**
   * Fire event for app started for focus with dynamic data
   * @event device-access-analytic-app-started
   */
  appStartedFocus() {
    if (this.hasStarted.counter === 0) {
      this.hasStarted.counter += 1;
      this.set('deviceAccessAnalytics.step', this.stepData.stepFocus);
      this._dataDeviceAccessAnalytics('device-access-analytic-app-started');
    }
  }

  /**
   * Fire event for app started for camera with dynamic data
   * @event device-access-analytic-app-started
   */
  appStartedCamera() {
    if (this.hasStarted.counter === 0) {
      this.hasStarted.counter += 1;
      this.set('deviceAccessAnalytics.step', this.stepData.stepCamera);
      this._dataDeviceAccessAnalytics('device-access-analytic-app-started');
    }
    this.footprintQrOcrScreen();
  }

  /**
   * Fire event for app step two with dynamic data
   * @event device-access-analytic-app-step-two
   */
  appStepTwo(data) {
    this.deviceAccessAnalytics.process = data === 'ivr' ? this.typologyData?.ivr : data === 'biometric' ? this.typologyData?.biometric : this.typologyData?.ivrBiometric;
    this.set('deviceAccessAnalytics.step', data === 'ivr' ? this.stepData.stepIvr : this.stepData.stepBiometric);
    this._dataDeviceAccessAnalytics(`device-access-analytic-app-step-two-${data}`);
  }

  /**
   * Fire event for footprint call in process
   * @event device-access-analytic-footprint-call-in-process
   */
  footprintCallInProcess() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-call-in-process');
  }

  /**
   * Fire event for footprint qr ocr screen
   * @event device-access-analytic-footprint-qr-ocr-screen
   */
  footprintQrOcrScreen() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-qr-ocr-screen');
    this.footprintOcr('haveQr');
  }

  /**
   * Fire event for footprint notifications error
   * @event device-access-analytic-footprint-notifications-error
   */
  footprintNotificationsError() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-notifications-error');
  }

  /**
   * Fire event for footprint face recognition blocked
   * @event device-access-analytic-footprint-face-recognition-blocked
   */
  footprintFaceRecognitionBlocked() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-face-recognition-blocked');
  }

  /**
   * Fire event for footprint invalid card
   * @event device-access-analytic-footprint-invalid-card
   */
  footprintInvalidCard() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-invalid-card');
  }

  /**
   * Fire event for footprint ocr with dynamic data
   * @event device-access-analytic-footprint-have-qr
   */
  footprintOcr(param) {
    this.set('deviceAccessAnalytics.linkUrl', param === 'haveQr' ? this.linkUrlData.haveQR : this.linkUrlData.notHaveQr);
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-have-qr');
  }

  /**
   * Fire event for footprint successful face print
   * @event device-access-analytic-footprint-successful-face-print
   */
  footprintSuccessfulFacePrint() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-successful-face-print');
  }

  /**
   * Fire event for footprint successful face print click
   * @event device-access-analytic-footprint-successful-face-print-click'
   */
  footprintSuccessfulFacePrintClick() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-successful-face-print-click');
  }

  /**
   * Fire event for footprint for must register again modal
   * @event device-access-analytic-footprint-must-register-again
   */
  footprintMustRegisterAgain() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-must-register-again');
  }

  /**
   * Fire event for app started for credit with dynamic data
   * @event device-access-analytic-app-started
   * @event device-access-analytic-identify-without-card-or-account
   */
  appStartedCredit() {
    if (this.hasStarted.counter === 0) {
      this.hasStarted.counter += 1;
      this.deviceAccessAnalytics.step = this.stepData.stepIdentificate;
      this._dataDeviceAccessAnalytics('device-access-analytic-app-started');
    } else {
      this._dataDeviceAccessAnalytics('device-access-analytic-identify-without-card-or-account');
    }
  }

  /**
   * Fire event for footprint user application blocked
   * @event device-access-analytic-footprint-user-error-application-blocked
   */
  footprintErrorApplicationBlocked() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-user-error-application-blocked');
  }

  /**
   * Fire event for footprint user error camera denied access
   * @event device-access-analytic-footprint-user-error-camera-denied-access
   */
  footprintErrorNoCameraPermissions() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-user-error-camera-denied-access');
  }

  /**
   * Fire event for footprint user error something is wrong
   * @event device-access-analytic-footprint-user-error-something-is-wrong
   */
  footprintErrorSomethingIsWrong() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-user-error-something-is-wrong');
  }

  /**
   * Fire event for footprint user error incorrect identity
   * @event device-access-analytic-footprint-user-error-incorrect-identity
   */
  footprintErrorIncorrectIdentity() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-user-error-incorrect-identity');
  }

  /**
   * Fire event for footprint user error identity fail
   * @event device-access-analytic-footprint-user-error-identity-fail
   */
  footprintErrorIdentityFail() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-user-error-identity-fail');
  }

  /**
   * Fire event for footprint user error access with card
   * @event device-access-analytic-footprint-user-error-access-with-card
   */
  footprintErrorAccessWithCard() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-user-error-access-with-card');
  }

  /**
   * Fire event for footprint user success activation
   * @event device-access-analytic-footprint-user-success-activation
   */
  footprintSuccessActivation() {
    this._dataDeviceAccessAnalytics('device-access-analytic-footprint-user-success-activation');
  }

  /**
   * Fire event for footprint identify without card or account
   * @event device-access-analytic-identify-without-card-or-account
   */
  footprintIdentifyWithoutCardOrAccount() {
    this._dataDeviceAccessAnalytics('device-access-analytic-identify-without-card-or-account');
  }

  /**
   * Persists values
   * @param {String} eventName
   */
  _dataDeviceAccessAnalytics(eventName) {
    this.persistData(this.deviceAccessAnalytics);
    this._dispatch(eventName, this.data);
  }
}
customElements.define(GlomoAnalyticsDeviceAccessesManagerMx.is, GlomoAnalyticsDeviceAccessesManagerMx);
