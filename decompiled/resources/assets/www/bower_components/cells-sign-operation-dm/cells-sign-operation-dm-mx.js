
/**
 * `CellsSignOperationDmMx`
 *
 * @summary handles signature operation logic.
 * @customElement
 * @polymer
 * @extends {Polymer.Element}
 */
/* global CellsSignOperationDmMixin */
class CellsSignOperationDmMx extends CellsSignOperationDmMixin.mixin(
  Polymer.mixinBehaviors([ CellsBehaviors.i18nBehavior ], Polymer.Element)
) {
  static get is() {
    return 'cells-sign-operation-dm-mx';
  }

  static get properties() {
    return {
      _authenticationTypes: {
        type: Object,
        value: () => {
          return {
            '05': {
              type: '05',
              priority: 1,
              id: 'SMS',
              action: '_smsSignFlow',
              requiresFirstStep: true
            },
            '15': {
              type: '15',
              priority: 4,
              id: 'SMS',
              action: '_smsSignFlow',
              requiresFirstStep: true
            },
            '33': {
              type: '33',
              priority: 2,
              id: 'SOFT-TOKEN',
              action: '_softTokenSignFlow',
              requiresFirstStep: false
            },
            '132': {
              type: '132',
              priority: 4,
              challenge: '',
              id: 'SOFT-TOKEN',
              action: '_softTokenS3Challenge',
              requiresFirstStep: false
            },
            '145': {
              type: '145',
              priority: 3,
              id: 'SOFT-TOKEN',
              action: '_softTokenCronto',
              requiresFirstStep: false
            },
            '238': {
              type: '238',
              priority: 5,
              id: 'CALL',
              action: '_callOtp',
              requiresFirstStep: true
            },
          };
        }
      },
      /**
       * Default serial soft-token key
       */
      localSoftTokenSeedKey: {
        type: String,
        value: 'MX_softtoken_serial'
      },
      /**
       * Soft-token type
       */
      softTokenType: {
        type: String,
        value: 'TOTP'
      },
      /**
      * Check true if environment dont have secureSharingPlugin available
      */
      hasNoDecryptedSeedSupport: {
        type: Boolean,
        value: false
      },
      _decryptedSeed: {
        type: String
      },
      _tokenGenerated: {
        type: String
      },
      _phoneNumber: {
        type: String
      },
      /**
       * Stores the device id, used to send on plugin cronto.
       */
      deviceId: String,
      /**
       * Flag to know if it's the first time showing error modal
       */
      _secondTimeModal: {
        type: Boolean,
        value: false
      },
      /**
       * Used to store code and message for alert modal
       */
      validationErrorClosingOptions: {
        type: Object,
        value: () => ({})
      },
      /**
       * Stores the current token
       */
      _signatureValue: {
        type: String,
        value: ''
      },
      /**
       * @description flags from glomo-settings
       * @type {Object}
       */
      featureFlagCollection: {
        type: Object,
        value: () => ({}),
      },
      /**
      * Counter to logout
      */
      _counterErrorOtp: {
        type: Number,
        value: 0,
      },
      /**
      * Stores the user serial
      */
      _serial: {
        type: String
      },
      /**
      * Timer limit to token in milliseconds
      * @type {Number}
      */
      limitTimerToken: {
        type: Number,
        value: 30000
      },
      /**
      * Counter to token in milliseconds
      * @type {Number}
      */
      _timerToken: {
        type: Number,
        value: 0
      },
      /**
      * Difference timer in milliseconds
      * @type {Number}
      */
      _diffTimerToken: {
        type: Number,
        value: 0
      },
      /**
       * Inform if the device is native iOS
       * @type {Boolean}
       */
      isNativeiOS: {
        type: Boolean,
        value: false
      },
      /**
       * Unique user identifier
       * @type {String}
       */
      userId: { type: String },
      /**
       * Serial token
       * @type {String}
       */
      _serialToken: { type: String },
      /**
       * Boolean for execute funcion
       * @type {Boolean}
       */
      isActiveSign: {
        type: Boolean,
        value: false
      },
      /**
       * Boolean for deleting tokens
       * @type {Boolean}
       */
      hasToDeleteTokens: {
        type: Boolean,
        value: false
      },
      /*
       * Object that is necessary to get a new otp message
       */
      event: {
        type: Object,
        value: () => ({})
      },
      /**
       * Object that contains predefined token names.
       * @type {Object}
       */
      tokensTypes: {
        type: Object,
        value: () => ({
          S2: 'tokenS2'
        })
      },
      /**
       * Flag to know if the user is logged
       * @type {Boolean}
       */
      isLogged: {
        type: Boolean,
        value: false
      }
    };
  }

  static get observers() {
    return [];
  }

  /**
   * Init method.
   * Fires an event to get the customer-id from Local-Storage.
   */
  ready() {
    super.ready();
    this.__fire('get-native-local-storage', { key: 'softTokenUserId', secure: true });
  }

  /**
   * Fires an event to share the customer-id.
   * @param {Object} response
   */
  onSuccessStorageResponse(response) {
    const customerId = (response?.softTokenUserId) ?? (response?.customerId);
    if (customerId) {
      this.__fire('cells-sign-customer-id', customerId);
    }
  }

  /**
   * Open modal callUp
   */
  _callOtp() {
    this.__fire('open-modal-call-timer', this._onCallUpSuccess());
  }

  /**
   * Check and assign signature type
   * Usually binded to 'signature-required-first-step' event of the sign behavior
   */
  handleSignatureRequiredFirstStep(evt = {}) {
    this.event = evt;
    this._otpId = (evt || {}).otpId;
    this._currentAuthenticationType = this._getCurrentAuthenticationConfig(evt);
    if (this._currentAuthenticationType && this._currentAuthenticationType.requiresFirstStep) {
      this._fireEventAuthenticationType();
    } else {
      this._configureSignature(evt);
    }
  }

  /**
   * Fires an signature-required event with a modal configuration
   * Usually binded to 'signature-required' event
   */
  handleSignatureRequired(evt = {}) {
    this._configureSignature(evt);
  }

  /**
   * Calls an action method from current authentication type
   *
   * @param {Object} evt
   */
  _configureSignature(evt) {
    this._otpId = (evt || {}).otpId;
    this._currentAuthenticationType = this._getCurrentAuthenticationConfig(evt);
    if (evt?.challenge) {
      const { challenge } = evt;
      this.challenge = challenge;
      this._currentAuthenticationType.challenge = challenge;
    } else {
      this.challenge = '';
      if (this._currentAuthenticationType && 'challenge' in this._currentAuthenticationType) {
        this._currentAuthenticationType.challenge = '';
      }
    }
    if (this._currentAuthenticationType && this[this._currentAuthenticationType.action]) {
      this[this._currentAuthenticationType.action]();
    }
  }

  /**
   * Returns authentication type from request event
   * @param {Object} evt
   * @returns Object
   */
  _getCurrentAuthenticationConfig(evt = {}) {
    let signatureType = evt.type || '';
    const mandatorySignType = evt.mandatorySignType;
    signatureType = signatureType.includes(mandatorySignType) ? mandatorySignType : signatureType;

    return this._getAuthenticationType(signatureType.split(';'));
  }

  /**
   * Returns authentication type object
   * @param {Array} types
   * @returns Object
   */
  _getAuthenticationType(types) {
    return types.reduce((acc, type) => {
      return (this._authenticationTypes[type] || {}).priority > (acc || {}).priority ? this._authenticationTypes[type] : acc;
    }, this._authenticationTypes[types[0]]);
  }

  /**
   * Starts soft-token flow
   */
  _softTokenSignFlow() {
    if (this.native) {
      if (this.hasNoDecryptedSeedSupport) {
        this._getNativeToken(false);
      } else {
        this._getSerial();
      }
    } else {
      this.openSoftTokenModal(false, false);
    }
  }

  _getNativeToken(signAfterTimer) {
    this._generateSoftToken()
      .then(res => {
        if (res.token) {
          if (signAfterTimer) {
            this._signRequest(res.token);
          } else {
            this._tokenGenerated = res.token;
            this.openSoftTokenModal(this._tokenGenerated, false);
          }
        } else if (res.timer) {
          this.__fire('sign-modal-close-spinner');
          this._handleGenerateTokenError();
        }
        this._deviceConfiguration.stEnrolled = true;
      })
      .catch(() => {
        this._openDefaultSignatureError();
        this.__fire('signature-modal-close-reset');
      });
  }

  /**
   * Calls openSoftTokenModal with seed param if soft-token is enrolled or not
   */
  async _getSerial() {
    this._decryptedSeed = await this._generateSoftTokenList().catch(() => false);
    if (this._decryptedSeed) {
      this.openSoftTokenModal(this._decryptedSeed, false);
    } else {
      this.redirectToPage();
    }
  }

  /**
   * @description Submit a new request, the posible cases are:
   * Case 1: SMS authentication
   * Case 2: SoftToken authentication
   * Case 3: SoftToken enrolled
   * Case 4: Default case
   */
  submitSign(sign) {
    if (this._isSmsAuthenticationType()) {
      this._handleSmsSignature(sign);
    } else if (this._decryptedSeed) {
      this._handleSofttokenSignature();
    } else if (this._deviceConfiguration.stEnrolled) {
      this._handleSoftTokenEnrolled();
    } else {
      this._signRequest(sign);
    }
  }

  /**
   * @description Mehtod that handles a signature when authentication type is 33 or 145
   */
  _handleSofttokenSignature() {
    this._generateSoftTokenList().then(token => {
      if (token.otp.length === 8) {
        this._signatureValue = token.otp;
        this._timerToken = Date.now();
        this._signRequest(token.otp);
      } else {
        this._handleGenerateTokenError();
      }
    }).catch(() => {
      this.__fire('sign-modal-close');
      this.redirectToPage();
    });
  }

  /**
   * @description Method that handles the case when a soft-token is enrolled
   */
  _handleSoftTokenEnrolled() {
    if (this._tokenGenerated) {
      this._signRequest(this._tokenGenerated);
      this._tokenGenerated = undefined;
    } else {
      this._getNativeToken(true);
    }
  }

  /**
    * @description Method that handles a signature when authentication type is 05 or 15
    * @param {String} sign
    */
  _handleSmsSignature(sign) {
    this._signRequest(sign);
  }

  /**
   * Method that verifies if the current authentication type is for SMS
   * @returns {Boolean}
   */
  _isSmsAuthenticationType() {
    return this._currentAuthenticationType.type === '05' || this._currentAuthenticationType.type === '15';
  }

  /**
   * Generates a new software token
   * @param {String} method
   * @returns Promise
   */
  async _generateSoftTokenList(method = 'genOtp') {
    const successCode = '0';
    const getTokenList = await this.$.softTokenPlugin.getTokenList(this.softTokenType).catch(err => err);
    const {array, code} = getTokenList;
    if (array && code === successCode) {
      const {type, serial} = array[0];
      this._serial = serial;
      return this.$.softTokenPlugin[method](serial, null, this.deviceId, type);
    }
    return Promise.reject();
  }

  _generateSoftToken() {
    return this.$.softTokenPluginMx.getToken({})
      .then(res => res);
  }

  /**
   * Open offline soft-token modal
   */
  openSoftTokenModal(isSTenrolled, timer) {
    this._notifySignatureType(this.get('type', this._currentAuthenticationType), this._otpId);
    this._deviceConfiguration.stEnrolled = isSTenrolled;
    this._calculateTimer();
    this.__fire('signature-required', this._signatureValue === '' ? this._getSoftTokenModalConfig() : this._getSoftTokenTimer());
  }

  _calculateTimer() {
    const diffTimer = Math.floor((Date.now() - this._timerToken) / 1000) * 1000;
    this._diffTimerToken = this.limitTimerToken - diffTimer;
    if (diffTimer >= this.limitTimerToken) {
      this._resetSignatureValue();
    }
  }

  _smsSignFlow() {
    this.__fire('signature-required', this._getSmsSignModal());
  }

  /**
   * Fires a new otp request event
   */
  requestNewOtp() {
    this.__fire('signature-request-new-sms-' + this._otpId, { otpEvent: 'signature-request-new-sms', otpId: this._otpId});
    this.handleSignatureRequiredFirstStep(this.event);
  }

  /**
  * update otp modal config to remove timer when countdown finish
  */
  updateSoftTokenModalConfig() {
    const timer = true;
    const fakeSoftToken = '00000000';
    const isenrolled = this._deviceConfiguration.stEnrolled;
    if (this._currentAuthenticationType.type === '33' && timer) {
      this.__fire('update-modal-softtoken-settings', {
        otp: isenrolled ? fakeSoftToken : undefined,
        confirmInfoText: 'cells-sign-modal-confirm-info-text-timer'
      });
    } else if (this._currentAuthenticationType.type !== '05') {
      this.__fire('update-modal-softtoken-settings', {
        otp: isenrolled ? fakeSoftToken : undefined,
        confirmInfoText: 'cells-sign-modal-confirm-info-text'
      });
    }
  }

  /**
  * Returns a cells-sign-operation-modal config object
  * @returns config object
  */
  _getSoftTokenModalConfig() {
    const type = this._currentAuthenticationType.type;
    const isSTenrolled = this._deviceConfiguration.stEnrolled;
    const fakeSoftToken = '00000000';
    const modalInfoText = {
      type: 'info',
      icon: 'coronita:info',
      message: 'cells-sign-modal-token-info-slave-text'
    };
    let softTokenConfig = {
      modalHeader: `cells-sign-modal-${type}-header`,
      validationErrorMessage: `cells-sign-modal-${type}-validation-error-message`,
      imgSrc: Polymer.ResolveUrl.resolveUrl('images/otp/otp-token.svg'),
      inputMaxChars: 8,
      isBottomButtons: true,
      allowedChars: '[0-9]',
      showButtons: true,
      showInput: true,
      openSpinner: true,
      signatureType: type,
      modalMainText: `cells-sign-modal-${type}-main-text`,
      inputIcon: 'coronita:close',
      primaryButton: {
        buttonName: 'cells-sign-modal-05-button-name-confirm',
        buttonEvent: 'cells-sign-operation-submit',
        buttonClassName: 'primary'
      },
    };

    return Object.assign(softTokenConfig, isSTenrolled ? {
      modalMainText: 'cells-sign-modal-soft-token-auto-generated',
      modalInfoText: isSTenrolled ? '' : modalInfoText,
      inputType: 'password',
      confirmInfoText: 'cells-sign-modal-confirm-info-text',
      permanentBlockInput: true,
      otp: fakeSoftToken,
      keepSecondaryButtonActive: true,
      inputIcon: ''
    } : {});
  }

  /**
  * Returns a modal cells-sign-operation-modal config object
  * @returns config object
  */
  _getSoftTokenTimer() {
    const type = this._currentAuthenticationType.type;
    const isSTenrolled = this._deviceConfiguration.stEnrolled;
    const fakeSoftToken = '00000000';
    const modalInfoText = {
      type: 'info',
      icon: 'coronita:info',
      message: 'cells-sign-modal-token-info-slave-text'
    };
    let softTokenConfig = {
      modalHeader: `cells-sign-modal-${type}-header`,
      validationErrorMessage: `cells-sign-modal-${type}-validation-error-message`,
      imgSrc: Polymer.ResolveUrl.resolveUrl('images/otp/otp-token.svg'),
      inputMaxChars: 8,
      isBottomButtons: true,
      allowedChars: '[0-9]',
      showButtons: true,
      showInput: true,
      openSpinner: true,
      signatureType: type,
      modalMainText: `cells-sign-modal-${type}-main-text`,
      inputIcon: 'coronita:close',
      validationInfoMessage: 'cells-sign-modal-33-message',
      signFormClass: 'dark',
      beginWithTimerClass: 'input-secondary-text',
      confirmInfoTextAdditional: '  ',
      hideTimerHeader: true,
      infoInputType: 'info-dark',
      hideIconClock: true,
      timerSecs: this._diffTimerToken,
      timerUntilEnabled: true,
      beginWithTimer: false,
      showCounterCircular: true,
      counterCircularSize: 60,
      classCounter: 'timer-custom-content horizontal',
      primaryButton: {
        buttonName: 'cells-sign-modal-33-button-name-accept',
        buttonEvent: 'cells-sign-operation-submit',
        buttonClassName: 'primary'
      },
    };
    return Object.assign(softTokenConfig, isSTenrolled ? {
      modalMainText: 'cells-sign-modal-soft-token-auto-generated',
      modalInfoText: isSTenrolled ? '' : modalInfoText,
      inputType: 'password',
      permanentBlockInput: true,
      otp: fakeSoftToken,
      keepSecondaryButtonActive: true,
      inputIcon: ''
    } : {});
  }

  _getSoftTokenModalCronto() {
    const type = this._currentAuthenticationType.type;
    const isSTenrolled = this._deviceConfiguration.stEnrolled;
    const fakeSoftToken = '00000000';
    let softTokenConfig = {
      modalHeader: `cells-sign-modal-${type}-header`,
      validationErrorMessage: `cells-sign-modal-${type}-validation-error-message`,
      imgSrc: Polymer.ResolveUrl.resolveUrl('images/otp/otp-token.svg'),
      inputMaxChars: 8,
      isBottomButtons: true,
      allowedChars: '[0-9]',
      showButtons: true,
      showInput: true,
      openSpinner: true,
      modalMainText: `cells-sign-modal-${type}-main-text`,
      inputIcon: 'coronita:close',
      primaryButton: {
        buttonName: 'cells-sign-modal-05-button-name-confirm',
        buttonEvent: 'cells-sign-operation-submit-cronto',
        buttonClassName: 'primary'
      }
    };
    return Object.assign(softTokenConfig, isSTenrolled ? {
      modalMainText: 'cells-sign-modal-soft-token-auto-generated',
      confirmInfoText: 'cells-sign-modal-confirm-info-text',
      otp: fakeSoftToken,
      inputType: 'password',
      inputIcon: ''
    } : {});
  }
  _softTokenCronto() {
    this._getStorage('deviceAccesses')
      .then(deviceAccesses => {
        this._deviceConfiguration.bioType = (deviceAccesses || {}).bioType;
        this._deviceConfiguration.biometricEnabled = false;
        this._deviceConfiguration.stEnrolled = true;
        this.__fire('signature-required', this._getSoftTokenModalCronto());
      })
      .catch(() => {
        this._openDefaultSignatureError();
        this.__fire('signature-modal-close-reset');
      });
  }
  _getStorage(key = 'deviceAccesses', type = 'local') {
    const storage = window[`${type}Storage`];
    const storageValue = JSON.parse(storage.getItem(key));
    return Promise.resolve(storageValue);
  }
  _getSmsSignModal() {
    const type = this._currentAuthenticationType.type;
    const phoneNumber = this._phoneNumber !== undefined ? ` ••••${this._phoneNumber}` : '';
    const secondaryText = `${this.t(`cells-sign-modal-${type}-secondary-text`)}${phoneNumber}.`;
    return {
      headerModalClass: 'unfixed-header wrapper-sign-modal',
      modalMainText: `cells-sign-modal-${type}-main-text`,
      beginWithTimer: true,
      beginWithTimerClass: 'input-secondary-text',
      modalHeader: `cells-sign-modal-${type}-header`,
      modalSecondaryText: secondaryText,
      label: `cells-sign-modal-${type}-label`,
      validationInfoMessage: `cells-sign-modal-${type}-validation-info-message`,
      validationErrorMessage: `cells-sign-modal-${type}-validation-error-message`,
      imgSrc: 'images/otp/password_sms.svg',
      inputIcon: 'coronita:close',
      inputType: 'input-code',
      infoMessageClass: 'dark-core-blue-icon',
      iconVisibility: 'focused-content',
      unitType: '',
      inputMaxChars: 6,
      confirmInfoTextAdditional: 'cells-sign-modal-05-confirm-info-text-additional',
      hideTimerHeader: true,
      signFormClass: 'dark',
      hideIconClock: true,
      allowedChars: '[0-9]',
      scrollEnabledClass: 'scroll',
      showButtons: true,
      resetTimerSecs: true,
      timerSecs: 180000,
      showCounterCircular: true,
      showTrail: true,
      trailWidth: '.5',
      counterCircularSize: 60,
      classCounter: 'timer-custom-content horizontal',
      showInput: true,
      openSpinner: true,
      hideSecondaryButton: true,
      showResendButton: true,
      primaryButton: {
        buttonName: 'cells-sign-modal-05-button-name-confirm',
        buttonEvent: 'cells-sign-operation-submit',
        buttonClassName: 'primary'
      },
      resendButton: {
        buttonName: 'cells-sign-modal-05-button-name-request',
        buttonEvent: 'cells-sign-operation-get-new-sms'
      },
      isBottomButtons: false
    };
  }

  /**
   * Reset signature value
   */
  _resetSignatureValue() {
    this._signatureValue = '';
  }

  getPhoneUser(payload) {
    if (payload !== undefined) {
      this._phoneNumber = payload.substring(6);
    }
  }

  /**
   * Sets alert modal properties for soft token locked
   */
  openSignatureNotFoundError() {
    this._modalAlertManager({
      code: 'soft-token-locked-error',
      primaryButtonClass: 'primary',
      title: 'alert-signature-not-found-error-title',
      heroImage: './images/errors/micro-error.svg',
      openMaximized: true,
      acceptBtLabel: 'alert-signature-error-accept-call-bank',
      type: 'paragraphs',
      valueTitle: 'alert-signature-not-found-error-message-title',
      valueText: 'alert-signature-not-found-error-message',
      valueLinkIcon: 'coronita:place',
      valueIconClass: 'icon-size-24',
      valueLink: 'alert-signature-not-found-error-ATM',
      valueEventName: 'show-map'
    });
    this.__fire('back-to-entry-point');
    this.__fire('close-control-veil');
  }

  /**
   * Receives payload to build alert modal
   * @param {Object} payload
   */
  _modalAlertManager(payload) {
    const softTokenLockedMock = {
      code: payload.code,
      primaryButtonClass: payload.primaryButtonClass,
      selectedConfig: {
        title: payload.title,
        className: payload.className,
        heroImage: payload.heroImage,
        iconOnlyFullHeight: payload.iconOnlyFullHeight,
        openMaximized: payload.openMaximized,
        time: payload.time,
        acceptBtLabel: payload.acceptBtLabel,
        cancelBtLabel: payload.cancelBtLabel,
        template: {
          type: payload.type,
          values: [
            {
              icon: payload.valueIcon,
              class: payload.valueIconClass
            },
            {
              title: payload.valueTitle,
              class: payload.valueTitleClass
            },
            {
              text: payload.valueText
            },
            {
              rawtext: payload.valueRawText,
              class: payload.valueRawTextClass
            },
            {
              linkIcon: payload.valueLinkIcon,
              iconClass: payload.valueIconClass,
              link: payload.valueLink,
              eventName: payload.valueEventName,
            }
          ]
        }
      }
    };
    this.__fire('signature-error', softTokenLockedMock);
  }

  /**
   * Sets alert modal values depending on the times it has been shown
   */
  openSignatureUnsuccessfulValidationError() {
    this._modalAlertManager({
      code: `SIGN-OPERATION-RESEATED-${this.validationErrorClosingOptions[this._secondTimeModal].code}`,
      className: 'error exit',
      openMaximized: false,
      iconOnlyFullHeight: true,
      acceptBtLabel: this.validationErrorClosingOptions[this._secondTimeModal].label,
      type: 'paragraphs',
      valueTitle: 'alert-signature-generic-error-message-title',
      valueTitleClass: 'strong',
      valueText: 'alert-signature-generic-error-message',
      valueIcon: 'coronita:alert',
      valueIconClass: 'spacing'
    });
    this._secondTimeModal = !this._secondTimeModal;
  }

  /**
   * Calls function to set modal when token has been used moments ago
   * @param {*} code
   * @param {*} time
   */
  _handleGenerateTokenError(code = 'standby-otp', time = 30000) {
    this._openWaitNewTokenAlert(code, time);
  }

  /**
   * Sets values to modal when token is used again within seconds
   */
  _openWaitNewTokenAlert(code, time) {
    const timer = time / 1000;
    this._modalAlertManager({
      code,
      primaryButtonClass: 'primary',
      className: 'caution image--sd',
      heroImage: './images/alerts/caution.svg',
      openMaximized: true,
      time,
      title: 'cells-sign-modal-standby-otp-title',
      acceptBtLabel: 'cells-sign-modal-standby-otp-acept',
      type: 'paragraphs',
      valueRawText: this.t('cells-sign-modal-standby-otp-remaining-time-text-timer', undefined, {timer}),
      valueRawTextClass: 'simple-text',
    });
  }

  /**
   * Call modal is displayed for service activate signature 238
   */
  _onCallUpSuccess() {
    return {
      code: 'DIGITAL-ACTIVATION-CALL-UP',
      selectedConfig: {
        className: 'full-height-info header--white header--white-call-me-back close-button--right button-less margin-zero-bottom',
        heroImage: './images/identified_call.svg',
        openMaximized: true,
        closeIcon: '',
        title: 'digital-activation-call-success-title',
        time: 60000,
        textTimer: 'alert-DIGITAL-ACTIVATION-timer-description',
        textTimerEnable: true,
        info: {
          type: 'info-dark',
          icon: 'coronita:info',
          message: 'digital-activation-call-message',
          class: 'icon-message-container'
        },
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'digital-activation-call-values-title',
              class: 'simple-title'
            },
            {
              text: 'digital-activation-call-values-text'
            }
          ]
        }
      }
    };
  }

  /**
   * Event for send params to plugin 'TokenCronto', comand: generate_otp
   */
  submitSignCronto() {
    this.__fire('generate-token-cronto', {deviceId: this.deviceId, challenge: ''});
  }

  /**
   * Get otp token cronto
   * @param {*} response
   */
  getCrontoOtp(response) {
    const {otp} = response;
    this._signRequest(otp);
  }

  /**
  * Validate the flag and redirect to the user
  * @event redirect-to-page-st-enrollment
  */
  redirectToPage() {
    const tokenReSynch = this.featureFlagCollection['glomo.securityJourneys.TokenReSynch']?.value;
    if (tokenReSynch  && this.isLogged && this._counterErrorOtp >= 2) {
      this._counterErrorOtp = 0;
      this.removeToken();
      this.__fire('redirect-to-page-st-enrollment');
    }
  }

  /**
  * Delete the serial
  */
  async removeToken() {
    this._generateSoftTokenList();
    await this.deleteAllTokensType();
  }

  /**
    * When the AWS token has been deleted correctly, it redirects to another function.
    */
  deleteTokenSuccess() {
    this._successOnDeleteToken();
  }

  /**
   * Delete various types of tokens,
   * including S2, S3, and Cronto.
   * @param tokenList An array of token objects.
   * @example
   * [{type: "tokenS2", hasToken: true}]
   */
  async deleteAllTokensType(tokenList = []) {
    this.$.tokenCrontoPlugin.deleteToken();
    if (this.isNativeiOS) {
      if (tokenList.length === 0) {
        const softToken = await this.$.softTokenPlugin.getTokenList('TOTP').catch(() => ({array: []}));
        this._serial = softToken?.array[0]?.serial;
      } else {
        const tokenS2 = tokenList.find(item => item.type === this.tokensTypes.S2)?.tokenS2;
        this._serial = tokenS2?.array[0]?.serial;
      }
      this.$.softTokenPlugin.deleteToken(this._serial?.slice(6, 8), 'prefix_filter');
    } else {
      this.$.softTokenPlugin.deleteTokens();
    }
    await this._removeAllTokenS3Ids();
  }

  /**
   * This method executes only when the Ether plugin returns an array with different serials.
   * Event to delete a Token S3.
   * @event delete-ether-token-s3
   *
   * Event to notify a delete error.
   * @event delete-ether-token-s3-error
   */
  async _removeAllTokenS3Ids() {
    this.hasToDeleteTokens = true;

    while (this.hasToDeleteTokens) {
      this.__fire('delete-ether-token-s3');
      const isTokenDeleted = await this._initDeleteTokenPromise().catch(error => error);

      if (isTokenDeleted) {
        this.hasToDeleteTokens = (await this._initEtherTokenPromise().catch(() => [])).length !== 0;
      } else {
        this.__fire('delete-ether-token-s3-error');
        break;
      }
    }
  }

  /**
   * Initializes a Promise to handle callbacks for Token S3.
   */
  _initEtherTokenPromise() {
    this.__fire('sign-get-tokens-ids');
    return new Promise((resolve, reject) => {
      this.stEtherTokenResolve = resolve;
      this.stEtherTokenReject = reject;
    });
  }

  /**
   * Initializes a Promise to handle callbacks for deleting Token S3.
   */
  _initDeleteTokenPromise() {
    return new Promise((resolve, reject) => {
      this.stDeleteTokenResolve = resolve;
      this.stDeleteTokenReject = reject;
    });
  }

  /**
   * This method handles a successful response when the Token S3 is deleted.
   * @param {Array} detail
   */
  deleteTokenS3success() {
    if (this.stDeleteTokenResolve) {
      this.stDeleteTokenResolve(true);
      this.stDeleteTokenResolve = null;
    }
  }

  /**
   * This method handles an unsuccessful response when the Token S3 is not deleted.
   */
  deleteTokenS3error() {
    if (this.stDeleteTokenReject) {
      this.stDeleteTokenReject(false);
      this.stDeleteTokenReject = null;
    }
  }

  /**
  * Handler for signature errors
  * @param {*} evt
  */
  handlerSignatureErrors(evt) {
    const errorTypes = {
      'signature-invalid': 'handlerSignatureInvalid',
      'signature-invalid-soft-token-error': '_checkInvalidError',
      'signature-expired-error': 'openSignatureExpiredError',
      'signature-attempts-error': 'openSignatureAttemptsError',
      'signature-not-available-error': 'openSignatureNotAvailableError',
      'signature-not-found-error': 'openSignatureNotFoundError',
      'signature-generic-error': '_openDefaultSignatureError',
      'signature-blocked-soft-token-error':
      'openSignatureBlockedSoftTokenError',
      'signature-no-authentication-soft-token-error':
      'openSignatureNoAuthenticationSoftTokenError',
      'signature-unsuccessful-validation-error':
      'openSignatureUnsuccessfulValidationError',
      'signature-locked-credentials-error':
      'openSignatureBlockedSoftTokenError',
    };
    this._otpId = evt.otpId;
    this.signReset();
    this.__fire('sign-modal-close-spinner');
    this.__fire('signature-close-veil');
    const errorHandler =
      errorTypes[evt.errorType] || errorTypes['signature-generic-error'];
    this[errorHandler]();
  }

  /**
  * Validates the counter and logout the user
  * @event redirect-user
  */
  handlerSignatureInvalid() {
    this._resetSignatureValue();
    if (this.isLogged) {
      this._counterErrorOtp++;
      if (this._counterErrorOtp >= 2) {
        this.__fire('sign-modal-close');
        this.redirectToPage();
      } else {
        this._handleGenerateTokenError();
      }
    } else {
      this.openSignatureInvalidError();
    }
  }

  _successOnDeleteToken() {
    this.__fire('close-control-veil');
  }

  /**
   * Start S3 challenge sign flow
   * @param challenge
   * @private
   */
  _softTokenS3Challenge() {
    if (!this._currentAuthenticationType?.challenge) {
      this._signRequest();
    } else {
      this.isActiveSign = true;
      this._initEtherTokenPromise();
    }
  }

  /**
   * This methods config an Object for a modal.
   * @returns {Object}
   */
  _getModalS3() {
    const type = this._currentAuthenticationType.type;
    const isSTenrolled = this._deviceConfiguration.stEnrolled;
    const fakeSoftToken = '00000000';
    let configModal = {
      modalHeader: `cells-sign-modal-${type}-header`,
      validationErrorMessage: `cells-sign-modal-${type}-validation-error-message`,
      imgSrc: Polymer.ResolveUrl.resolveUrl('images/otp/otp-token.svg'),
      inputMaxChars: 8,
      isBottomButtons: true,
      allowedChars: '[0-9]',
      showButtons: true,
      showInput: true,
      openSpinner: true,
      modalMainText: `cells-sign-modal-${type}-main-text`,
      inputIcon: 'coronita:close',
      primaryButton: {
        buttonName: 'cells-sign-modal-05-button-name-confirm',
        buttonEvent: 'cells-sign-operation-submit-s3',
        buttonClassName: 'primary'
      }
    };
    return Object.assign(configModal, isSTenrolled ? {
      modalMainText: 'cells-sign-modal-soft-token-auto-generated',
      confirmInfoText: 'cells-sign-modal-confirm-info-text',
      otp: fakeSoftToken,
      inputType: 'password',
      inputIcon: ''
    } : {});
  }

  /**
   * Response serial ether token
   * @param {Array} payload
   */
  setTokenSerialS3(payload) {
    if (this.isActiveSign && Array.isArray(payload) && payload.length) {
      this._deviceConfiguration.stEnrolled = true;
      this._serialToken = payload.slice(-1)[0];
      this.__fire('signature-required', this._getModalS3());
    }
    if (this.stEtherTokenResolve) {
      this.stEtherTokenResolve(payload);
      this.stEtherTokenResolve = null;
    }
  }

  /**
   * This method handles an unsuccessful response
   * when the Ether-Token is called.
   */
  setSoftTokenSerialError() {
    if (this.stEtherTokenReject) {
      this.stEtherTokenReject([]);
      this.stEtherTokenReject = null;
    }
  }

  /**
   * Config object with params for OTP
   * OTP - CHALLENGE S3
   * @param {Boolean} next
   * @returns
   */
  configParamsS3() {
    const action = 'CHALLENGE';
    const tokenId = this._serialToken;
    const challenge = this._currentAuthenticationType?.challenge;
    return { action, tokenId, challenge };
  }

  /**
   * This method makes the call to generate the otp for s3 token
   */
  submitSignS3() {
    const action = 'generateOtp';
    const params = this.configParamsS3();
    const eventName = {
      OTP: 'gen-otp',
      CHALLENGE: 'genotpchallenge',
    }[params.action];
    const detail = {action, eventName, params};
    this.__fire('ether-token-custom-call', detail);
  }

  /**
   * Get otp token cronto
   * @param {*} payloadOtp
   */
  getOtpS3(payloadOtp) {
    if (this.isActiveSign && payloadOtp?.value && payloadOtp?.value.length !== 0) {
      this.isActiveSign = false;
      this.challenge = '';
      this._signRequest(payloadOtp?.value);
    }
  }
}

customElements.define(CellsSignOperationDmMx.is, CellsSignOperationDmMx);
