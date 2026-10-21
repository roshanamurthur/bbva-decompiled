/*eslint new-cap: 0*/
class GlomoDeviceAccessesMxStController extends Polymer.Element {
  static get is() {
    return 'glomo-device-accesses-mx-st-controller';
  }

  static get properties() {
    return {
      /**
       * Default global apis security host
       * @type {String}
       */
      host: String,
      /**
       * Default customer id
       * @type {String}
       */
      customerId: String,
      /**
       * Default user id
       * @type {String}
       */
      userId: String,
      /**
       * Default required token header
       * @type {String}
       */
      requiredToken: {
        type: String,
        value: 'tsec'
      },
      /**
       * Default security api version
       * @type {String}
       */
      securityApiVersion: {
        type: String,
        value: '0'
      },
      /**
       * Default local security api version
       * @type {String}
       */
      securityLocalApiVersion: {
        type: String,
        value: '0'
      },
      /**
       * Default instance otp id
       * @type {String}
       */
      otpId: {
        type: String,
        value: 'device-accesses'
      },
      /**
       * Secure sharing token seed key
       * @type {String}
       */
      secureSharingSoftTokenSeedKey: {
        type: String,
        value: 'MX_softtoken_serial'
      },
      /**
       * Default sign authentication type
       * @type {String}
       */
      authenticationType: {
        type: String,
        value: '58'
      },
      /**
       * For softToken authentication and registerSoftToken
       * @type {String}
       */
      deviceId: String,
      /**
       * Current native tsec
       * @type {Object}
       */
      tsec: {
        type: Object,
        value: () => ({})
      },
      /**
       * Default soft-token register type
       * @type {String}
       */
      registerType: {
        type: String,
        value: 'ACTIVATION'
      },
      /**
       * Default soft-token register contact type
       * @type {String}
       */
      contactType: {
        type: String,
        value: 'MOBILE_NUMBER'
      },
      /**
       * Soft-token serial
       * @type {String}
       */
      softTokenSerial: String,
      /**
       * Sends the variable
       * for the text depending on the type of
       * model id in the response data of service
       * listTokens request with the GET method
       * @type {Object}
       */
      listTokenTexts: {
        type: Object,
        value: () => ({})
      },
      /**
       * Id of token
       * @type {String}
       */
      tokenId: String,
      /**
       * Model of token
       * @type {String}
       */
      tokenModel: String,
      /**
       * Status of token
       * @type {String}
       */
      tokenStatus: {
        type: String,
        value: ''
      },
      /**
       * User-Agent
       * @type {String}
       */
      userAgent: {
        type: String,
        value: ''
      },
      /**
       * Contact id
       * @type {String}
       */
      contactId: {
        type: Object,
        value: {}
      },
      /**
       * Allowed token models physical
       * @type {Array}
       */
      allowedTokenModelsPhysical: {
        type: Array,
        value: () => ['S1', 'S2', 'S3', 'S02', 'SO2', 'T5', 'T3', 'T1', 'SOF3', 'SOFTWARE', 'SAM', 'SOFTWARE_AMAZON', 'PHY']
      },
      /**
       * Allowed token models type Aws
       * @type {Array}
       */
      allowedTokenAws: {
        type: Array,
        value: () => ['S3', 'SOF3', 'SAM', 'SOFTWARE_AMAZON']
      },
      /**
       * This property represents a list of the different types of S2 tokens
       * that can exist when activating the global "authenticationDevices" service.
       */
      allowedTokenSofttoken: {
        type: Array,
        value: () => ['S2', 'S02', 'SO2', 'SOFTWARE', 'PHY']
      },
      /**
       * This property indicates all the token types that can exist related to a cronto token.
       * @type {Array}
       */
      allowedTokenCronto: {
        type: Array,
        value: () => ['CRO', 'BOT', 'PHYSICAL_AND_SOFTWARE']
      },
      /**
       * This property indicates all the token types that may exist when activating
       * the global "Authentication Devices" service. This property is used to change
       * the texts when displaying the "stEnrollment" screen.
       * @type {Array}
       */
      allowedTokenModels: {
        type: Array,
        value: () => ['S1', 'S2', 'S3', 'S02', 'SO2', 'T5', 'T3', 'T1', 'SOF3', 'SOFTWARE', 'SAM', 'SOFTWARE_AMAZON', 'CRO', 'BOT', 'PHYSICAL_AND_SOFTWARE', 'PHY']
      },
      /**
       * Unique authentication code
       * @type {String}
       */
      authCode: {
        type: String,
        value: ''
      },
      /**
       * @description flags from glomo-settings
       * @type {Object}
       */
      featureFlagCollection: {
        type: Object,
        value: () => ({
        }),
        observer: '_setFeatureFlagsCollectionStatus'
      },
      /**
       * @description Counter for error pages
       * @type {Object}
       */
      s3TokenActivationRetries: {
        type: Object,
        value: {
          intents: 0,
          maxAttempts: 3,
        },
      },
      /**
       * @type {String}
       * @description Indicates the token type
       * Example: tokenS2, tokenS3 or tokenCronto
       */
      tokenType: {
        type: String,
        value: ''
      },
      /**
       * Provide the token details
       * @type {Object}
       */
      tokenDetail: {type: Object},
      /**
       * @type {Boolean}
       * @description Indicates the current status of the page.
       * If the page is 'stBackgroundEnrollment', the status will be set to 'true'; otherwise,
       * it will be 'false'.
       */
      isBackgroundEnrollment: {
        type: Boolean,
        value: false
      },
      /**
       * @type {Boolean}
       * @description Indicates the status Flag:
       * Flag: authenticationDevicesGlobalFlag
       */
      _authenticationDevicesGlobalFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @type {Boolean}
       * @description Indicates the status Flag:
       * Flag: s3StockClientsMigratio
       */
      s3StockClientsMigrationFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @type {Boolean}
       * @description Indicates the status Flag:
       * Flag: s3NewClientsMigration
       */
      s3NewClientsMigrationFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @type {Boolean}
       * @description Indicates the status Flag:
       * Flag: s3Contingency
       */
      s3ContingencyFlag: {
        type: Boolean,
        value: false
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
       * Detects the exact moment when the transition
       * from a token s2 to a token s3 occurs in the sequence.
       * @type {Boolean}
       */
      transitionS2toS3On: {
        type: Boolean,
        value: false
      },
      /**
       * It indicates that it is an s3 token and that the contingency flag is on.
       * @type {Boolean}
       */
      s3AndContingencyFlagOn: {
        type: Boolean,
        value: false
      },
      /**
       * It indicates that it is an s3 token and that the contingency flag is disabled.
       * @type {Boolean}
       */
      s3AndContingencyFlagOff: {
        type: Boolean,
        value: false
      },
      /**
       * It refers to a token of type S2, where the clientsMigration flag is disabled
       * @type {Boolean}
       */
      s3andsS3NewClientsMigrationOff: {
        type: Boolean,
        value: false
      },
      /**
       * Specify the current state of the token.
       * @type {String}
       */
      deviceActivate: {
        type: String,
        value: ''
      },
      /**
       * Indicates the image that will be displayed in the error modal if it is triggered.
       */
      errorModalImg: {
        type: String,
        value: ''
      },
      /**
       * Property that contains the bbva telephone line.
       * @type {String}
       */
      lineBbva: {
        type: String,
        value: ''
      },
      /**
       * Property that contains different tokens
       * @type {Array}
       */
      tokensList: {
        type: Array,
        value: () => [],
        observer: '_checkTokensList'
      },
      /**
       * Property indicates error in back for delete tokens that type S3
       * @type {Boolean}
       */
      errorBackEnrollment: {
        type: Boolean,
        value: false
      },
      /**
       * Property that evaluates whether you are enrolled and have been activated correctly
       */
      isEnrollmentActivated: {
        type: Boolean,
        value: false
      },
      /**
       * Indicates that an error occurred in the activation of the S3 type token.
       */
      errorActivations3: {
        type: Boolean,
        value: false
      },
      /**
       * Indicates the status to trigger activateTokenAws method.
       */
      hasToActivateTokenAws: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Sets flag values related to token activation or reactivation.
   *
   */
  _setFeatureFlagsCollectionStatus() {
    if (JSON.stringify(this.featureFlagCollection) !== '{}') {
      this._authenticationDevicesGlobalFlag = this.featureFlagCollection['glomo.securityJourneys.authenticationDevicesGlobal']?.value;
      this.s3StockClientsMigrationFlag = this.featureFlagCollection['glomo.securityJourneys.s3StockClientsMigration']?.value;
      this.s3NewClientsMigrationFlag = this.featureFlagCollection['glomo.securityJourneys.s3NewClientsMigration']?.value;
      this.s3ContingencyFlag = this.featureFlagCollection['glomo.securityJourneys.s3Contingency']?.value;
    }
  }

  /**
   * Observer that fires an event if there are two or more tokens found.
   * @param {Array} tokensArray
   * @event delete-all-token-types
   */
  _checkTokensList(tokensArray = []) {
    if (tokensArray.length) {
      let maxSerials = 0;
      let totalFoundTokens = 0;

      tokensArray.forEach(token => token.size >= 1 && (totalFoundTokens++, maxSerials = token.size));

      if (totalFoundTokens > 1 || maxSerials > 1) {
        this._fireEvent('delete-all-token-types', tokensArray);
      }
    }
  }

  /**
  * Dispatches and closes the spinner and creates an
  * object in which the default user id and default customer id go,
  * based on the response data of service listTokens
  * request with the method GET
  * @event open-control-veil
  */
  initStEnrollment() {
    this._fireEvent('open-control-veil');
    this._validateFeatureFlags();
    this.set('s3TokenActivationRetries.intents', 0);
  }

  /**
   * This method checks and validates the type of token
   * assigned to the user.
   * @param {Array} tokens
   * @event open-control-veil
   */
  enrollmentTokenBackground(tokens = []) {
    this._fireEvent('open-control-veil');
    this.tokenDetail = tokens.find(item => item.hasToken !== false);
    this.tokenType = Object.keys(this.tokenDetail).find(item => /token[A-Z]/.test(item));

    if (this.tokenType === 'tokenS2') {
      this.tokenId = this.tokenDetail?.tokenS2?.array[0]?.serial;
      this.validationS3Stock();
    } else if (this.tokenType === 'tokenS3') {
      this.tokenId = this.tokenDetail?.tokenS3[0];
      this.validateContingency();
    } else {
      this.continueToNextLanding();
    }
  }

  /**
  * Validates a flag and dispatches the event for consumption of a service
  * @event get-list-devices
  * @event get-list-token
  */
  _validateFeatureFlags() {
    if (this._authenticationDevicesGlobalFlag) {
      const paramsS3 = { profileId: this.userId };
      this.registerType = 'REACTIVATION';
      this._fireEvent('get-list-devices', paramsS3);
    } else {
      const paramsS2 = { contactDetail: this.userId, contactType: this.contactType };
      this._fireEvent('get-list-token', paramsS2);
    }
  }

  /**
  * Assigns the values REACTIVATION, SUBSTITUTE or ACTIVATION
  * based on the response data of service listTokens
  * request with the method GET
  * @param {Array} data
  * @event close-control-veil
  * @event glomo-device-accesses-soft-on-set-info-title-error
  * @event on-set-info-text
  * @event on-set-more-info-text
  */
  listTokenSuccess(data = []) {
    const tokenInfo = data[0];
    this.tokenModel = tokenInfo?.model?.id;
    this.tokenStatus = tokenInfo?.status?.id;
    const tokenType = tokenInfo?.tokenType?.id;

    if (this.tokenStatus === 'A1') {
      if (tokenType === 'HARDWARE_TOKEN') {
        if (this.tokenModel === 'T7') {
          this.tokenId = tokenInfo?.id;
        } else {
          this.registerType = 'SUBSTITUTION';
        }
      } else {
        /* istanbul ignore else */
        if (['S1', 'S2', 'S3'].includes(this.tokenModel)) {
          this.registerType = 'REACTIVATION';
        }
      }
      this._fireEvent('on-set-info-title', this.listTokenTexts[this.tokenModel]?.infoTitle);
      this._fireEvent('on-set-info-text', this.listTokenTexts[this.tokenModel]?.infoText);
      this._fireEvent('on-set-more-info-text', this.listTokenTexts[this.tokenModel]?.moreInfoText);
    }

    this._fireEvent('close-control-veil');
  }

  /**
   * Error function that assigns the value to RegisterType
   * in order to call the activateSoftToken function.
   */
  listTokenError() {
    this.tokenModel = 'S2';
    this.registerType = 'ACTIVATION';
    this._configModalErrorContent();
  }

  /**
  * Obtains the device that corresponds to the type of AWS token, if the SAM type and if it is active
  * @param {*} payload
  * @event on-set-info-title
  * @event on-set-info-text
  * @event on-set-more-info-text
  * @event close-control-veil
  */
  autenthicationDevicesGetSuccess(payload) {
    const deviceActive = payload.find(device => this.allowedTokenModels.includes(device.deviceType.id));
    this.tokenId = deviceActive?.serialNumber;
    this.tokenModel = deviceActive?.deviceType?.id;
    this.deviceActivate = deviceActive?.status?.id;
    this._fireEvent('on-set-info-title', this.listTokenTexts[this.tokenModel]?.infoTitle);
    this._fireEvent('on-set-info-text', this.listTokenTexts[this.tokenModel]?.infoText);
    this._fireEvent('on-set-more-info-text', this.listTokenTexts[this.tokenModel]?.moreInfoText);
    this._fireEvent('close-control-veil');

    if (/td|TD/.test(this.tokenId)) {
      this.registerType = 'ACTIVATION';
    }
  }

  /**
   * Error function that assigns the token value to call the events that will be fired.
   */
  configErrorAuthDevice() {
    this.tokenModel = this.allowedTokenAws.includes(this.tokenModel) ? this.tokenModel : 'SAM';
    this._configModalErrorContent();
  }

  /**
   * Error function fires events to display the corresponding texts.
   * @event on-set-info-text
   * @event on-set-more-info-text
   * @event close-control-veil
   */
  _configModalErrorContent() {
    this._fireEvent('on-set-info-text', this.listTokenTexts[this.tokenModel]?.infoText);
    this._fireEvent('on-set-more-info-text', this.listTokenTexts[this.tokenModel]?.moreInfoText);
    this._fireEvent('close-control-veil');
  }

  /**
   * Token type validation to be able to activate
   */
  validateActivateToken() {
    if (this.allowedTokenModelsPhysical.includes(this.tokenModel) || ((this.allowedTokenCronto.includes(this.tokenModel) && this.deviceActivate !== 'ACTIVE') || this.tokenModel === 'T7' && this.tokenStatus !== 'A1')) {
      this.activateTokens();
    }
    if (this.tokenModel === 'T7' && this.tokenStatus === 'A1' || this.allowedTokenCronto.includes(this.tokenModel) && this.deviceActivate === 'ACTIVE') {
      this.activateTokenCronto();
    }
  }

  /**
   * Validates the type of token it has except for the cronto token
   */
  activateTokens() {
    if (this.s3NewClientsMigrationFlag) {
      this.activateTokenAws();
    } else {
      this.s3andsS3NewClientsMigrationOff = (this.allowedTokenAws.includes(this.tokenModel) && !this.s3NewClientsMigrationFlag);
      this.activateSoftToken();
    }
  }

  /**
  * Activate token, send params to activate
  * @event open-control-veil
  * @event activate-token-cronto
  */
  activateTokenCronto() {
    this._fireEvent('open-control-veil');
    this.tokenId = this.tokenId.replace(/([A-Z]+-)+F/g, 'F');
    const pluginParams = { deviceId: this.deviceId, serialNumber: this.tokenId, headers: { tsec: this.tsec.token } };
    this.softTokenSerial = this.tokenId;
    this._fireEvent('activate-token-cronto', pluginParams);
  }

  /**
   * Handle successes activate token cronto
   */
  tokenCrontoSuccess() {
    this._executeSecureSharing();
  }

  /**
   * Handle error activate token cronto
   * @param {*} error
   */
  tokenCrontoError(error) {
    const {code} = error;
    if (code === 6) {
      this._handleSTEnrollmentLimitReachedError();
    } else {
      this._handleSTEnrollmentError();
    }
  }

  /**
   * Modal error limit reached cronto
   * @event show-modal-error
   */
  _handleSTEnrollmentLimitReachedError() {
    const errorLimit = {
      code: 'token-cronto-exit',
      selectedConfig: {
        className: 'full-height-error',
        hideCloseIcon: false,
        openMaximized: true,
        title: 'device-accesses-cronto-enrollment-error-limit-reached-title',
        heroImage: './images/errors/error.svg',
        message: 'device-accesses-cronto-enrollment-error-limit-reached-message',
        acceptBtLabel: 'device-accesses-cronto-enrollment-error-limit-reached-btn-accept-bt-label',
        onAcceptEvent: () => this.exit(),
        cancelFromHeaderEvent: 'cancel-from-header',
        showAvatar: true,
        template: {
          type: 'paragraphs',
          values: [
            {
              text: 'device-accesses-cronto-enrollment-error-limit-reached-text-one'
            },
            {
              text: 'device-accesses-cronto-enrollment-error-limit-reached-text-two'
            },
            {
              linkIcon: 'coronita:place',
              iconClass: 'icon-size-24',
              link: 'device-accesses-cronto-enrollment-error-limit-reached-link',
              action: () => this.openAtmLocator()
            }
          ]
        }
      }
    };
    this._fireEvent('show-modal-error', errorLimit);
  }

  /**
   * Redirecto to atm-locator
   * @event navigate-to-atm-locator
   */
  openAtmLocator() {
    this._fireEvent('navigate-to-atm-locator');
  }

  /**
   * Starts soft-token activation flow
   * @event open-control-veil
   */
  activateSoftToken() {
    if (!this.isBackgroundEnrollment) {
      this._fireEvent('open-control-veil');
    }
    this.$.dpSecurity.postSoftwareTokens({ 'deviceIdentifier': this.deviceId });
  }

  /**
   * Checks if it is necessary to dispatch an deleteToken or continue to next landing
   */
  validationS3Stock() {
    if (this.s3StockClientsMigrationFlag) {
      this.transitionS2toS3On = (this.tokenType === 'tokenS2' && this.s3StockClientsMigrationFlag);
      this._deleteAllSoftokens();
    } else {
      this.continueToNextLanding();
    }
  }

  /**
   * Deletes token S3 when OTP or service fails.
   */
  deleteTokenS3() {
    if (this.errorBackEnrollment) {
      this.goToStEnrollment();
    } else if (this.errorActivations3) {
      this.errorActivations3 = false;
      this._handleActivateTokenError();
    } else if (this.s3AndContingencyFlagOn) {
      this.activateSoftToken();
    } else if (this.hasToActivateTokenAws) {
      this.hasToActivateTokenAws = false;
      this.activateTokenAws();
    }
  }

  /**
   * Activate token aws , send params to activate service SoftwareTokensV0.
   * @event open-control-veil
   * @event activate-token-aws
   */
  activateTokenAws() {
    if (!this.isBackgroundEnrollment) {
      this._fireEvent('open-control-veil');
    }
    this.softTokenSerial = this.tokenId;
    this._fireEvent('activate-token-aws', { body: { deviceId: this.userId } });
  }

  /**
   * Success of the post service, sending parameters to activate the
   * createclient api of the etherToken plugin
   * @param {*} payload
   * @event ether-token-activate-client
   */
  postTokenSuccess(payload) {
    this.authCode = payload?.authCode;
    this.tokenId = payload?.id;
    this._fireEvent('ether-token-activate-client', {
      authCode: this.authCode,
      tokenId: this.tokenId,
      deviceId: this.deviceId
    });
  }

  /**
   * Function success  plugin etherToken, api generateactivationform
   * sending parameters to the authenticationDevicesCreateSoftwareTokenActivationV0 service
   * @param {*} payload
   * @event software-token-activate-post
   */
  etherTokenGenerateSuccess(payload) {
    const data = {
      headers: {},
      params: {
        'software-token-id': this.tokenId,
      },
      body: {
        salt: payload?.salt,
        deviceId: this.deviceId,
        authCodeHash: payload?.hashCode,
        activationData: payload?.data
      }
    };
    this._fireEvent('software-token-activate-post', data);
  }

  /**
   * Fuction success for service softwareTokenActivation,
   * send params for the etherToken plugin response, activatetoken api
   * @param {*} payload
   * @event create-software-token-devices
   */
  postTokenActivationSuccess(payload) {
    const dataPlugin = {
      data: payload?.activationData,
      seed: payload?.seed,
      tokenId: this.tokenId,
      configuration: payload?.configuration,
    };
    this._fireEvent('create-software-token-devices', dataPlugin);
  }

  /**
   * Handle successes activate token aws
   * @param {*} payload
   */
  etherTokenActivateSuccess(payload) {
    this.softTokenSerial = payload?.tokenId;
    if (this.s3AndContingencyFlagOff) {
      this.continueToNextLanding();
    } else {
      this._executeSecureSharing();
    }
  }

  /**
   * Validate if the response is successful or of error
   * to register serial softToken
   * @param {string} res
   */
  _handleSTEnrollmentSuccess(res) {
    const authCode = res?.detail?.softwareTokenAuthCode;
    this.softTokenSerial = this.get('detail.id', res);
    const tsec = this.get('token', this.tsec);
    let options = {
      tsec,
      ...(this.userAgent && { 'User-Agent': this.userAgent }),
      ...(this.customerId && { 'customer-id': this.customerId }),
      ...(this.contactId?.customerbiocatch && { 'ContactId': this.contactId.customerbiocatch })
    };
    this.$.vinTokenSDK.registerToken(
      authCode,
      this.deviceId,
      this.softTokenSerial,
      null,
      options,
      null
    );
  }

  /**
   * Close the spinner and send the error
   * @event close-control-veil
   * @event glomo-device-accesses-soft-token-error
   */
  _handleSTEnrollmentError() {
    this._fireEvent('close-control-veil');
    this.tokenModel = this.allowedTokenSofttoken.includes(this.tokenModel);
    if (this.tokenModel) {
      this.isEnrollmentActivated = true;
      this._deleteAllSoftokens();
    } else {
      this._fireEvent('glomo-device-accesses-soft-token-error');
    }
  }

  /**
   * Register serial softtoken
   * @param {String} params
   */
  _registerSoftToken(serial) {
    const params = {
      'id': serial,
      'device': {
        'id': this.deviceId
      },
      'registerType': {
        'id': this.registerType
      },
      'contactDetail': {
        'contact': this.userId,
        'contactType': {
          'id': this.contactType
        }
      }
    };
    this.$.dpSecurity.postMxSoftwareTokensRegister(params);
  }

  /**
   * Checks if the Flag 's3Contingencia' is activated and sends the event depending on the flag
   * @event 'gen-s3-otp
   * @event 'delete-token-ether-s3'
   */
  validateContingency() {
    if (this.s3ContingencyFlag) {
      this.registerType = 'REACTIVATION';
      this.s3AndContingencyFlagOn = true;
      this._fireEvent('delete-token-ether-s3', this.tokenId);
    } else {
      this.s3AndContingencyFlagOff = true;
      this._fireEvent('gen-s3-otp', {action: 'OTP', tokenId: this.tokenId});
    }
  }

  /**
   * Navigates to the Dashboard following OTP generation.
   */
  generateOtpSuccess() {
    this.continueToNextLanding();
  }

  /**
   * Dispatches an error event to delete token S3.
   * @event delete-token-ether-s3
   */
  errorGenOtpS3() {
    this.hasToActivateTokenAws = true;
    this._fireEvent('delete-token-ether-s3', this.tokenId);
  }

  /**
   * Deletes all tokens s2.
   */
  _deleteAllSoftokens() {
    if (this.isNativeiOS) {
      const serial = this.isBackgroundEnrollment ? this.tokenDetail?.tokenS2?.array[0]?.serial : this.softTokenSerial;
      const tokenPrefix = serial?.slice(6, 8);
      this.$.vinTokenSDK.deleteToken(tokenPrefix, 'prefix_filter');
    } else {
      this.$.vinTokenSDK.deleteTokens();
    }
  }

  /**
   * Deletes tokens after the plugin runs successfully.
   * @event glomo-device-accesses-soft-token-error
   */
  _deleteSoftokenSuccess() {
    if (!this.isEnrollmentActivated) {
      this.activateTokenAws();
    } else {
      this.isEnrollmentActivated = false;
      if (this._shouldReactivateS2Token) {
        this._stEnrollmentErrorExit();
      } else {
        this._fireEvent('glomo-device-accesses-soft-token-error');
      }
    }
  }

  /**
   * Validates if it should execute flag service or save the serial
   */
  _validateContext() {
    if (this.s3AndContingencyFlagOn || this.s3andsS3NewClientsMigrationOff) {
      this._getProfileManagementData();
    } else {
      this._executeSecureSharing();
    }
  }

  /**
   * Save the serial token to SecureSharing and validate if it is in the background and the type of token it has.
   */
  _executeSecureSharing() {
    this.$.etherMobileSecureSharing.putValue({ value: this.softTokenSerial, key: this.secureSharingSoftTokenSeedKey });
  }

  /**
   * Extract detail content to get current status and fire events
   * @event close-control-veil
   * @event glomo-device-accesses-soft-token-success
   * @event glomo-device-accesses-soft-token-error
   * @param {detail} Object
   */
  _putValueSuccess({detail}) {
    const error = detail?.error || false;
    this._fireEvent('close-control-veil');
    this._fireEvent(`glomo-device-accesses-soft-token-${error ? 'error' : 'success'}`);

    if (this.transitionS2toS3On || this.s3AndContingencyFlagOn || this.s3andsS3NewClientsMigrationOff) {
      this.continueToNextLanding();
    }
  }

  /**
   * Retrieve the configuration data, trigger an event to share it,
   * and call the Profile Management Service.
   * @event path-user-profile-management
   */
  _getProfileManagementData() {
    const body = { isUpdated: true};
    const params = { 'user-id': this.userId, 'profile-id': this.userId};
    this._fireEvent('path-user-profile-management', {body, params});
  }

  /**
   * User management success response
   */
  userManagementSuccess() {
    this._executeSecureSharing();
  }

  /**
   * error function for the token activation page "stEnrollment".
   */
  errorEnrollment() {
    this.errorActivations3 = true;
    this._fireEvent('delete-token-ether-s3', this.tokenId);
  }

  /**
   * Indicates an error when any service fails during S3 activation.
  */
  goToErrorBack() {
    this.errorBackEnrollment = true;
    this._fireEvent('delete-token-ether-s3', this.tokenId);
  }

  /**
   * Sends an event for redirection to the next landing page and sends the number of failed attempts.
   * @event go-to-st-enrollment-page
   * @event close-control-veil
   */
  goToStEnrollment() {
    this.s3TokenActivationRetries = {intents: 1, maxAttempts: 3};
    this._fireEvent('go-to-st-enrollment-page',  this.s3TokenActivationRetries);
    this._fireEvent('close-control-veil');
  }

  /**
   * Modal error to retry
   * @event show-modal-error
   */
  _handleSTEnrollmentErrorS3() {
    const modalS3 = {
      code: 'token-s3-failure',
      selectedConfig: {
        className: 'full-height-error header--white',
        hideCloseIcon: false,
        openMaximized: true,
        title: 'glomo-device-s3-error',
        heroImage: this.errorModalImg,
        message: 'glomo-device-s3-activation-fails',
        acceptBtLabel: 'glomo-devices-s3-retry',
        onAcceptEvent: () => this.retryActivateToken(),
        cancelFromHeaderEvent: 'cancel-from-header',
        showAvatar: true,
        template: {
          type: 'paragraphs',
          values: [
            {
              text: 'glomo-device-s3-operation-fails-retry'
            }
          ]
        }
      }
    };
    this._fireEvent('show-modal-error', modalS3);
  }

  /**
   * Modal error to exit flow **MODAL DE ERROR PARA SALIR (DESPUES DE 4 INTENTOS)
   * @event show-modal-error
   */
  _stEnrollmentErrorExit() {
    const s3Exit = {
      code: 'ether-token-exit',
      selectedConfig: {
        className: 'full-height-error header--white',
        hideCloseIcon: false,
        openMaximized: true,
        title: 'glomo-device-s3-error',
        heroImage: this.errorModalImg,
        message: 'glomo-device-s3-sustitution-fails',
        acceptBtLabel: 'glomo-device-s3-exit',
        onAcceptEvent: () => this.exit(),
        cancelFromHeaderEvent: 'cancel-from-header',
        showAvatar: true,
        template: {
          type: 'paragraphs',
          values: [ {text: 'glomo-device-s3-bbva-call-line'} ]
        },
        hasMultipleRedirectLink: {
          values: [
            { linkIcon: 'coronita:telephone',
              iconClass: 'icon-size-24',
              link: 'glomo-device-s3-line-bbva',
              eventName: 'call-bbva-line',
              class: 'below-paragraph'
            },
            { linkIcon: 'coronita:place',
              iconClass: 'icon-size-24',
              link: 'glomo-device-s3-atm-locator',
              eventName: 'on-icon-click-place',
              class: 'below-paragraph'
            }
          ]
        }
      }
    };
    this._fireEvent('show-modal-error', s3Exit);
  }

  /**
   * Send the event to call the bbva line.
   */
  callBbvaLine() {
    this._fireEvent('st-enrollment-call-bbva-line', {value: this.lineBbva});
  }

  /**
   * Send the event to redirect to the branches page.
   */
  goToAtmLocator() {
    this._fireEvent('st-enrollment-atm-locator');
  }

  /**
   * Condition to retry token type services
   */
  retryActivateToken() {
    if (this.s3TokenActivationRetries.intents < this.s3TokenActivationRetries.maxAttempts)  {
      this.activateTokenAws();
    } else {
      this._shouldReactivateS2Token = true;
      this.activateSoftToken();
    }
  }

  /**
   * Dispatches error modals depending on the number of failed attempts.
   */
  _handleActivateTokenError() {
    this.s3TokenActivationRetries.intents += 1;
    if (this.s3TokenActivationRetries.intents < this.s3TokenActivationRetries.maxAttempts) {
      this._handleSTEnrollmentErrorS3();
    } else {
      this._shouldReactivateS2Token = true;
      this.activateSoftToken();
    }
  }

  _registerTokenSuccess(detail) {
    const {detail: {code}} = detail;
    if (code === '0') {
      this._registerSoftToken(this.softTokenSerial);
    } else {
      this._handleSTEnrollmentError();
    }
  }

  /**
   * Get out of the flow
   * @event st-logout-error
   */
  exit() {
    this._fireEvent('st-logout-error');
  }

  /**
   * Dispatches events to redirect to Dashboard.
   * @event close-control-veil
   * @event continue-to-next-landing
   */
  continueToNextLanding() {
    this._fireEvent('close-control-veil');
    this._fireEvent('continue-to-next-landing');
  }

  /**
   * Fire CustomEvent
   * @param {String} evt
   * @param {Object} detail
   */
  _fireEvent(evt, detail) {
    this.dispatchEvent(new CustomEvent(evt, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }
}

window.customElements.define(GlomoDeviceAccessesMxStController.is, GlomoDeviceAccessesMxStController);
