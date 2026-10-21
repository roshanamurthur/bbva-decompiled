/*global moment */
// eslint-disable-next-line no-undef
/*global GlomoKeyRecoveryDm*/
class GlomoKeyRecoveryMxDm extends Polymer.mixinBehaviors(
  [CellsBehaviors.i18nBehavior, CellsBehaviors.CellsCheckNestedKeysBehavior],
  GlomoKeyRecoveryDm) {

  static get is() {
    return 'glomo-key-recovery-mx-dm';
  }

  static get properties() {
    return {
      /**
      *  Chosen endpoint to make requests to. Check providers.
      *  Required to logs in or out.
      */
      host: {
        type: String
      },
      /**
      * Is native request
      */
      native: {
        type: Boolean,
        value: false
      },
      /**
      * Type of token is required, 'tsec' or 'jwt'
      */
      requiredToken: {
        type: String,
        value: ''
      },
      /**
       * User id
       */
      _user: {
        type: String,
        value: ''
      },
      /**
       * Object to persist user data
       */
      _dataNative: {
        type: Object,
        value: ()=>({})
      },
      /**
       * User personal PAN
       */
      _cardNumber: {
        type: Object,
        value: ()=>({})
      },
      /**
       * Max tries to Reintentar button
       */
      interrumpedConnectionMaxTry: {
        type: Number,
        value: 3
      },
      /**
       * Counter of tries in Reintentar button
       */
      interrumpedConnectionNumberTries: {
        type: Number,
        value: 0
      },
      /**
       * Properties to draw dom-repeat
       */
      _accessKeyComponentsPropertiesPhonePan: {
        type: Array,
        value: () => []
      },
      /**
       * Received value from date-selector to send birthdate
       */
      _selectedDate: {
        type: String,
        value: ''
      },
      /**
       * Default values to handle PIN-CVV UI component
       */
      _accessKeyComponentsPropertiesPinCvv: {
        type: Array,
        value: () => {
          return [{
            id: 'cvv',
            cellsKeyRecoveryLoginInputPlaceholder: 'CVV',
            autofocus: 'autofocus',
            errorMessage: 'glomo-key-recovery-dm-properties-cvv-message',
            errorMessageIcon: 'coronita:alert',
            maxLength: 3,
            icon: 'coronita:close',
            iconLabel: 'icon-label-clear',
            iconAction: 'clear',
            iconEventAction: '',
            iconVisibility: 'focused-content',
            toggleEmptyFillIcons: '',
            hideIconMessage: false,
            hideIconButton: true,
            iconMessage: 'glomo-key-recovery-dm-properties-cvv-icon-message',
            iconInfo: 'coronita:info',
            tagComponent: 'div',
            value: '',
            allowedDocumentValues: '^[0-9]{3,3}$',
            invalid: 'invalidCvv',
            type: 'password',
            allowedChars: '^\\d$',
          },
          {
            id: 'pin',
            cellsKeyRecoveryLoginInputPlaceholder: 'NIP',
            autofocus: 'autofocus',
            errorMessage: 'glomo-key-recovery-dm-properties-pin-message',
            errorMessageIcon: 'coronita:alert',
            maxLength: 4,
            icon: 'coronita:close',
            iconLabel: 'icon-label-clear',
            iconAction: 'clear',
            iconEventAction: '',
            toggleEmptyFillIcons: '',
            hideIconMessage: false,
            iconVisibility: 'focused-content',
            hideIconButton: true,
            iconMessage: 'glomo-key-recovery-dm-properties-pin-icon-message',
            iconInfo: 'coronita:info',
            tagComponent: 'cells-icon-message',
            value: '',
            allowedDocumentValues: '^[0-9]{4,4}$',
            invalid: 'invalidPin',
            type: 'password',
            allowedChars: '^\\d$',
          }
          ];
        }
      },
      /**
       * Boolean to handle array data
       */
      _isRememberedUser: {
        type: Boolean,
        value: false
      },
      /**
       * Event name given from page to handle exit to login page
       */
      accessKeyLoginEvent: {
        type: String,
        value: ''
      },
      /**
       * Event name given from page to handle close event
       */
      accessKeyHandleEvent: {
        type: String,
        value: ''
      },
      /**
       * Event name given from page to handle only reset page
       */
      accessKeyResetEvent: {
        type: String,
        value: ''
      },
      /**
       * Code given from page for selected config in reset page
       */
      accessKeyHandleCode: {
        type: String,
        value: ''
      },
      /**
       * Event name given from page to handle modal of generic error code
       */
      accessKeyResetGenericErrorCode: {
        type: String,
        value: ''
      },
      /**
       * Code given from page of selected config to handle modal of generic error
       */
      accessKeyGenericErrorEvent: {
        type: String,
        value: ''
      },
      /**
       * Code given from page to handle interrumped connection modal
       */
      interrumpedConnectionCode: {
        type: String,
        value: ''
      },
      /**
       * Event given from page to handle interrumped connection modal
       */
      interrumpedConnectionEvent: {
        type: String,
        value: ''
      },
      /**
       * Code given from page to handle max tries interrumped connection modal
       */
      interrumpedConnectionMaxCode: {
        type: String,
        value: ''
      },
      /**
       * Event given from page to handle max tries interrumped connection modal
       */
      interrumpedConnectionMaxEvent: {
        type: String,
        value: ''
      },
      /**
       * Event given from page to handle Invalid Credentials Internal modal
       */
      accessKeyInvalidCredentialsInternalEvent: {
        type: String,
        value: ''
      },
      /**
       * Code given from page to handle Invalid Credentials Internal modal
       */
      accessKeyInvalidCredentialsInternalCode: {
        type: String,
        value: ''
      },
      /**
       * Number of tries in error of identy
       */
      countIdentyError: {
        type: Number,
        value: 0
      },
      /**
       * Number of maximun tries in identy error
       */
      maxCountIdentyError: {
        type: Number,
        value: 3
      },
      /**
       * Page name information to handle code and event name
       */
      pageName: {
        type: String,
        value: ''
      },
      /**
       * String format to show date on successfull page
       */
      formatDate: {
        type: String,
        value: 'DD MMMM YYYY'
      },
      /**
       * Includes error codes for digital activation
       */
      _errorCodeForDigitalActivationFlow: {
        type: Array,
        value: () => ['C4', 'CN', 'EC', 'NE']
      },
      /**
       * Includes error codes to access recovery password page
       */
      _errorCodeForRecoveryPasswordUser: {
        type: Array,
        value: () => ['A1', 'PS', 'PE']
      },
      /**
       * Includes error code when user is fraud bloqued
       */
      _errorCodeForFraudBloquedUser: {
        type: Array,
        value: () => [ 'B4' ]
      },
      /**
       * Includes error code for nip bloqued user
       */
      _errorCodeForBloquedNipUser: {
        type: Array,
        value: () => [ 'PB' ]
      },
      /**
       * Flag to show selected flow (QR or Card number)
       */
      selectedFlow: {
        type: Number,
        value: 0
      },
      /**
       * Properties to draw dom-repeat
       */
      _accessKeyComponentsPropertiesPanQr: {
        type: Array,
        value: () => []
      },
      /**
       * Array to include positive match validation on Regex
       */
      passwordMatchValidation: {
        type: Array,
        value: () => []
      },
      /**
       * Properties to draw dom-repeat
       */
      _accessKeyComponentsPropertiesQr: {
        type: Array,
        value: () => []
      },
      /**
       * Flag to persist if is a QR card
       */
      _isQrFlow: {
        type: Boolean,
        value: false
      },
      /**
       * Selected config to know what flow will displayed
       */
      _radioButtonselected: {
        type: Number,
        value: -1
      },
      /*
       * Array to include negative match validation on Regex
       */
      passwordInputValidationRegex: {
        type: Array,
        value: ()  => [ '^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+){8,10}' ]
      },
      /**
       * Array for generic error types on UI component
       */
      passwordErrorTypes: {
        type: Array,
        value: () => []
      },
      /**
       * Property to send generic info modal on UI component
       */
      genericModalObj: {
        type: Object,
        value: () => ({})
      },
      /**
       * Date to show in successfull response page
       */
      actualDate: {
        type: Object,
        value: () => ({})
      },
      /**
       * Property for hhtps response
       */
      qrDataHttpresponse: {
        type: Number,
        value: 0
      },
      /**
       * Code for the use of physical card
       */
      usePhysicalCardErrorCode: {
        type: String,
        value: ''
      },
      /**
       * Event for the use of physical card
       */
      usePhysicalCardErrorEvent: {
        type: String,
        value: ''
      },
      /**
      * @type {Object}
      * @description Object for userCard
      */
      userCard: {
        type: Object
      },
      /**
       * @type {String}
       * @description consumerId
       */
      consumerId: {
        type: String,
        value: ''
      },
      /**
       * @type {String}
       * @description
       */
      userAnonymous: {
        type: String
      },
      /**
       * @type {String}
       * @description Type application. Required to login with card.
       */
      _consumerIdCard: {
        type: String,
        value: ''
      },
      /**
       * @type {String}
       * @description Authentication type
       */
      _authenticationType: {
        type: String,
        value: ''
      },
      /**
       * @type {String}
       * @description Customers API version
       */
      customersApiVersion: {
        type: String,
        value: '1'
      },
      /**
       * @type {Object}
       * @description Notifications API Headers
       */
      acceptLanguage: {
        type: Object,
        value: () => ({
          'Accept-Language': 'es'
        })
      },
      /** value for the encrypted cvv
       * @type {String}
       */
      cvvEncrypted: String,
      /**
       * value for the encrypted pin
       * @type {String}
       */
      pinEncrypted: String,
      /**
      * pin value
      */
      pinCard: Number,
      /**
       * cvv constant
       * @type {String}
       */
      cvvConst: {
        type: String,
        value: 'cvv'
      },
      /**
       * pin constant
       * @type {String}
       */
      pinConst: {
        type: String,
        value: 'pin'
      },
      /**
      * @type {Object}
      * @description Object for userQr
      */
      userQr: {
        type: Object
      },
      /**
      * @type {String}
      * @description Authentication type GT QR
      */
      authenticationTypeQr: {
        type: String,
        value: ''
      },
      /**
      * @type {String}
      * @description Authentication type GT QR
      */
      authenticationTypeNipCvv: {
        type: String,
        value: ''
      },
      /**
      * @type {String}
      * @description QR data authentication
      */
      qrToken: {
        type: String,
        value: ''
      },
      /**
      * @type {String}
      * @description Customer status with ID using QR
      */
      consumerIdStatusQr: {
        type: String,
        value: ''
      },
      /**
      * @type {String}
      * @description url QR
      */
      _urlQr: {
        type: String,
        value: ''
      },
      /**
       * @type {Boolean}
       * @description Flag to persist if it comes from the landing QR
       */
      isLandingQr: {
        type: Boolean,
        value: false
      },
      /**
       * @type {Object}
       * @description receive the value of the card from the landing QR
       */
      dataPan: {
        type: Object,
        value: () => ({})
      },
      /**
       * @type {String}
       * @description url QR
       */
      urlQrLanding: {
        type: String,
        value: ''
      },
      /**
       * @type {String}
       * @description identification const
       */
      identificationConst: {
        type: String,
        value: 'Error en la identificaci'
      },
      /**
       * @type {String}
       * @description additional card const
       */
      additionalCardConst: {
        type: String,
        value: 'TARJETA C ADICIONAL'
      },
      /**
       * @type {String}
       * @description titular card const
       */
      titularCardConst: {
        type: String,
        value: 'TARJETA C TITULAR'
      },
      /**
       * @type {String}
       * @description wallet card const
       */
      walletCardConst: {
        type: String,
        value: 'LA TARJETA ES WALLET'
      },
      /**
       * @type {String}
       * @description status card const
       */
      statusConst: {
        type: String,
        value: 'ESTATUS NO VALIDO'
      },

      errorCodes: {
        type: Object,
        value: () => ({
          'invalidCategorization': '_accesKeyRecoveryAdditional',
          'invalidCredentialsInternal': '_invalidCredentialsInternal',
          'operationRejected': '_usePhysicalCardError',
          'invalidRequest': '_accesKeyInvalidCardError',
          'invalidParameters': '_accesKeyInvalidCardError',
          'cardNotExist': '_invalidCredentialsInternal',
        })
      },
      /**
       * @type {String}
       * Event for user not register
       */
      registerUserEvent: {
        type: String,
        value: ''
      },
      /**
       * @type {String}
       * flag for modal opened
       */
      checkModal: {
        type: Boolean,
        value: false
      },

      /**
       * @type {String}
       * call new ksjo parameter flag depending on
       * open web flag 'migracionIaasKSJO'
       */
      callNewKsjo: {
        type: Boolean,
        value: false
      },

      /**
       * Global properties
      */

      /**
      * Modal help/init config object
      **/
      modalConfig: {
        type: Object,
        value: {
          code: 'CELLS-KEY-RECOVERY-UPDATE-INFO',
          primaryButtonClass: 'primary',
          selectedConfig: {
            heroImage: '',
            className: 'help-key-recovery full-height-info',
            openMaximized: true,
            title: 'cells-key-recovery-update-info-modal-header',
            acceptBtLabel: 'cells-key-recovery-update-info-modal-action-button-text',
            cancelFromHeaderEvent: null,
            onAcceptEvent: null,
            template: {}
          }
        }
      },

      /**
       * User old password
       */
      oldPassword: {
        type: String,
        value: ''
      },

      /**
       * Password value
       */
      newPassword: {
        type: String,
        value: ''
      },

      /**
       * Native request
       */
      userId: {
        type: String,
        value: ''
      },

      /**
       * BBVA phone
       */
      phone: {
        type: String,
        value: ''
      },

      /**
       * Quality of password
       */
      quality: {
        type: String,
        value: ''
      },
    };
  }

  static get observers() {
    return [
      '_sendUserDmData(cvvEncrypted, pinEncrypted)',
    ];
  }
  /**
  * @description method for public GT success
  */
  _loginAnonymousSuccess() {
    this.userAnonymous = '';
    this._postDigitalValidation();
  }

  /**
  * @description method for public GT Error
  */
  _loginAnonymousError() {
    this._closeControlVeil();
    if (this.userAnonymous !== '') {
      this.userAnonymous = '';
      this._interrumpedConnectionModal();
    }
  }

  /**
  * @description get de encripted cvv or pin from cells-mobile-libmcrypt component
  * @param {Object} data
  */
  getEncryptedData(data) {
    const dataType = this.c(data, 'type', '');
    if (dataType === this.cvvConst) {
      this.cvvEncrypted = data.response.value;
      this.getUnmaskedPin(this.pinCard);
    } else if (dataType === this.pinConst) {
      this.pinEncrypted = data.response.value;
    }
  }

  /**
  * @description get the unmasked cvv and prepare it to send it to cells-mobile-libmcrypt component
  * @param {String} cvv
  */
  getUnmaskedCVV(cvv) {
    const cvvParsed = cvv.padEnd(16, 'F');
    this._fireEvent('send-cvv-to-encrypt-event', {params: {value: cvvParsed}, type: this.cvvConst});
  }

  /**
  * @description get the unmasked pin and prepare it to send it to cells-mobile-libmcrypt component
  * @param {String} pin
  */
  getUnmaskedPin(pin) {
    const pinStarted = pin.padStart(6, 24);
    const pinParsed = pinStarted.padEnd(16, 'F');
    this._fireEvent('send-pin-to-encrypt-event', {params: {value: pinParsed}, type: this.pinConst});
  }

  /**
  * @description observer for cvv and pin encrypt
  * @param {String} cvvEncrypted
  * @param {String} pinEncrypted
  */
  _sendUserDmData(cvvEncrypted, pinEncrypted) {
    if (cvvEncrypted && pinEncrypted) {
      this._getGrantingTicketPinCvv();
    } else if (pinEncrypted && this._isQrFlow) {
      this._getGrantingTicketQr();
    }
  }

  /**
  * @description method for GT PIN and CVV
  */
  _getGrantingTicketPinCvv() {
    this._consumerIdCard = this.consumerId;
    if (this.authenticationTypeNipCvv.length > 0) {
      this._authenticationType = this.authenticationTypeNipCvv;
    }
    this.set('userCard', {
      userId: this._dataNative.pan,
      pan: this._dataNative.pan,
      pin: this.pinEncrypted,
      cvv: this.cvvEncrypted
    });
  }

  /**
  * @description method for private GT PIN, CVV Success
  */
  _loginCardCvvSuccess() {
    this.cvvEncrypted = undefined;
    this.pinEncrypted = undefined;
    this._channelStatus();
  }

  /**
  * @description method for private GT PIN and CVV Error
  * @param {Object} evt
  */
  _loginCardError(evt) {
    this._closeControlVeil();
    this.cvvEncrypted = undefined;
    this.pinEncrypted = undefined;
    const httpStatus = this.c(evt, 'detail', '')['http-status'];
    if ([500, 600].includes(httpStatus)) {
      this._interrumpedConnectionModal();
    } else if ([400, 403, 409, 415].includes(httpStatus)) {
      this._wrongIdentyModalError();
    } else {
      this._genericError();
    }
  }

  /**
  * @description method for granting ticket QR
  */
  _getGrantingTicketQr() {
    this._consumerIdCard = this.consumerIdStatusQr;
    if (this.isLandingQr) {
      this._dataUrl(this.urlQrLanding);
    } else {
      this._dataUrl(this._urlQr);
    }

    if (this.authenticationTypeQr.length > 0) {
      this._authenticationType = this.authenticationTypeQr;
    }
    this._fireEvent('login-with-qr', {pin: this.pinEncrypted, qrToken: this.qrToken[1]});
  }

  /**
  * @description private method  for granting ticket QR success
  */
  _loginQrSuccess() {
    this.cvvEncrypted = undefined;
    this.pinEncrypted = undefined;
    this._postDigitalValidation();
  }

  /**
  * @description  method that verifies if a customer has a digital account.
  */
  _postDigitalValidation() {
    if (this._dataNative.user) {
      const payload = {
        cardNumber: this._dataNative.pan,
        mobileNumber: this._dataNative.user
      };
      this.$.cellsDmGlobalApisCustomersMX.postDigitalValidation(payload);
    }
  }

  /**
  * @description  fire when the api DigitalValidation execution success
  */
  _postDigitalValidationSuccess() {
    this._closeControlVeil();
    this.resetPage();
    this._fireEvent('open-date-selector-page', this._dataNative);
  }

  /**
   * @description  fire when the api DigitalValidation execution error
   */
  _postDigitalValidationError(response) {
    const httpResponse = this.c(response, 'detail.status', '');
    const errorCode = this.c(response, 'detail', '')['error-code'];
    const errorMsg = this.c(response, 'detail', '')['error-message'];
    this._closeControlVeil();
    this._fireEvent('send-status-typology', httpResponse);
    switch (httpResponse) {
      case 400:
        this._digitalValidationIdentificationError(errorMsg, errorCode);
        break;
      case 409:
        this._handlingAlerts(errorCode);
        break;
      case 500:
        this._wrongIdentyModalError();
        break;
      case 600:
        this._interrumpedConnectionModal();
        break;
      default:
        this._genericError();
        break;
    }
    this._fireEvent('register-recovery-analytic-event');
  }

  /**
   * @description method to handle 'identificationError' from digital validation response
   * @param {String} errorMsg
   */
  _digitalValidationIdentificationError(errorMsg, errorCode) {
    if (errorMsg.includes(this.identificationConst) || errorMsg === this.additionalCardConst || errorMsg === '{0}') {
      if (this._isQrFlow) {
        this._channelStatus();
      } else {
        this.resetPage();
        this._fireEvent('open-cvv-nip-page', this._dataNative);
      }
    } else {
      this._digitalValidationIdentificationErrorAlert(errorCode);
    }
  }

  /**
   * @description
   * @param {String} errorCode
   */
  _digitalValidationIdentificationErrorAlert(errorCode) {
    if (errorCode) {
      this[this.errorCodes[errorCode]]();
    } else {
      this._invalidCredentialsInternal();
    }
  }

  /**
  * @description method that performs the validation of user status in channel
  */
  _channelStatus() {
    const payload = {
      mobileNumber: this._dataNative.user,
    };
    this.$.cellsDmGlobalApisCustomersMX.getCustomerChannelStatus(payload);
  }

  /**
  * @description  fire when the api getChannelStatus execution success
  * @param {Object} evt
  */
  _channelStatusSuccess(evt) {
    this._closeControlVeil();
    const statusId = this.c(evt, 'detail.status.id', '');
    if (this._errorCodeForDigitalActivationFlow.includes(statusId)) {
      this._fireEvent(this.registerUserEvent, true);
    } else if (this._errorCodeForRecoveryPasswordUser.includes(statusId)) {
      this.resetPage();
      this._fireEvent('open-access-key-reset-page', this._dataNative);
    } else if (this._errorCodeForFraudBloquedUser.includes(statusId)) {
      this._fraudBloquedUserModal();
    } else if (this._errorCodeForBloquedNipUser.includes(statusId)) {
      this._userNIPBloqued();
    } else {
      this._genericError();
    }
  }

  /**
  * @description  fire when api getChannelStatus returns error
  * @param {Object} evt
  */
  _channelStatusError(evt) {
    this._closeControlVeil();
    const httpStatus = this.c(evt, 'detail.status', '');
    const errorCode = this.c(evt, 'detail', '')['error-code'];
    if (httpStatus === 409) {
      if (errorCode ===  'CNE0007') {
        this._fireEvent(this.registerUserEvent, true);
      } else {
        this._genericError();
      }
    } else if (httpStatus === 500) {
      this._wrongIdentyModalError();
    } else {
      this._genericError();
    }
  }

  /**
  * @description  fire when api resetPassword returns success
  * @param {Object} evt
  */
  resetPasswordSuccess() {
    this._closeControlVeil();
    if (this.isLandingQr) {
      this._fireEvent('send-is-landing-qr-flag', this.isLandingQr);
    }
    this._resetDataManager();
    this._fireEvent('show-successfull-page');
  }

  /**
  * @description  fire when api resetPassword returns error
  * @param {Object} evt
  */
  resetPasswordError(evt) {
    this._closeControlVeil();
    const httpResponse = this.c(evt, 'status', '');
    if (httpResponse === 600) {
      this._interrumpedConnectionModal();
    } else if (httpResponse === 400) {
      if (evt.messages) {
        let errorCode = this.c(evt, 'messages', '')[0].message.split('#');
        if (errorCode.includes('MDO_017')) {
          this._genericWrongPasswordModal();
        } else if (['MDO_002', 'MDO_003', 'MDO_004', 'MDO_007', 'MDO_013'].includes(errorCode[0])) {
          this._interrumpedConnectionModal();
        } else {
          this._genericError();
        }
      } else {
        this._genericError();
      }
    } else {
      this._genericError();
    }
  }

  /**
  * Method to debug the QR url and obtain the authentication data (qrToken)
  * @param {*} dataUrl
  */
  _dataUrl(dataUrl) {
    const splittedUrl = dataUrl.split(/data=|&/);
    return this.qrToken = splittedUrl;
  }

  /**
   * Set from UI, the position on radio buttons array and disabled button of continue.
   * @param {Number} payload
   */
  selectedRadioButton(payload) {
    if (Number.isInteger(payload) && payload >= 0) {
      this.set('_radioButtonselected', payload);
      this._fireEvent('send-button-config', {
        buttons: {
          primary: {
            text: 'glomo-key-recovery-dm-continue-button',
            action: 'new-password-created',
            disabled: false
          }
        }
      });
      this._fireEvent('radio-button-selected-event', payload);
    }
  }
  /**
   * init method to set in array phone pan properties
   */
  initUserPan() {
    this.resetPage();
    this._isUserRemembered(this._dataNative);
  }

  /**
   * Init method to draw qr selector page, receive an object with remembered user response {rememberedUser: true, user: '1234567890', nip: '2212',  qrString: 'URL', isLanding: true}
   * @param {Object} payload
   */
  qrInit(payload = {}) {
    if (payload && Object.keys(payload).length !== 0) {
      this.set('_isRememberedUser', payload.rememberedUser);
      this.set('_user', payload.user);
    }
    if (!this.isLandingQr) {
      const data = ['glomo-key-recovery-dm-have-card-number', 'glomo-key-recovery-dm-have-qr-code'];
      this._fireEvent('send-init-qr-page', data);
      this.resetRadioButtons();
      this._fireEvent('send-button-config', {
        buttons: {
          primary: {
            text: 'glomo-key-recovery-dm-continue-button',
            action: 'new-password-created',
            disabled: true
          }
        }
      });
    }
    if (this.isLandingQr) {
      this._openControlVeil();
      this._radioButtonselected = 1;
      this.sendToRecoveryPage();
    }
  }

  /**
   * Init Qr page, reset cached data and send config to UI
   */
  initQrPage() {
    this.resetPage();
    this.resetRadioButtons();
    this._setQrProperties();
    this._fireEvent('send-qr-data-flow', this.qrDataHttpresponse);
  }

  /**
   * Public method to handle data on successfull page
   */
  setSuccessfullPage() {
    this.actualDate = moment(new Date(), this.formatDate);
    const result = {
      mainIcon: {
        src: './images/check_successful.svg',
        info: 'Operation Success'
      },
      mainTitle: {
        key: 'access-key-recovery-qr-subtitle-display-success',
        value: this.actualDate,
        class: 'bold'
      },
      buttons: {
        primary: {
          text: 'access-key-recovery-qr-button-text-display-success',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      }
    };
    this._fireEvent('set-result-data-to-success-page', result);
  }

  /**Event to UI for reset cached radio button selected
   */
  resetRadioButtons() {
    this._fireEvent('reset-button-list-value', -1);
  }
  /**
   * init method to set in array pin cvv properties
   */
  initCvvPage() {
    this.resetPage();
    this._setAccessKeyComponentsPropertiesPinCvv();
  }

  /**
   * init method to set default date properties
   */
  initDatePage() {
    this._fireEvent('send-init-date-page', undefined);
  }

  /**
   * Send to UI properties when is rememberer user or not
   */
  _setQrProperties() {
    this._isQrFlow = true;
    if (this.isLandingQr) {
      this._closeControlVeil();
      this.set('_dataNative.qrString', this.dataPan);
    }
    if (this._isRememberedUser) {
      this._fireEvent('send-qr-page-remembered-user', this._dataNative);
    } else {
      this.set('_accessKeyComponentsPropertiesPanQr', [ {
        id: 'user',
        autofocus: 'autofocus',
        cellsKeyRecoveryLoginInputPlaceholder: 'glomo-form-text-input-input-place-holder-phone-qr',
        allowedDocumentValues: '^[0-9]{10,10}$',
        errorMessage: 'glomo-key-recovery-dm-properties-phone-message',
        errorMessageIcon: 'coronita:alert',
        maxLength: 10,
        icon: 'coronita:close',
        iconLabel: 'icon-label-clear',
        iconAction: 'clear',
        iconEventAction: '',
        toggleEmptyFillIcons: '',
        hideIconMessage: true,
        iconMessage: 'glomo-form-text-input-message-phone-input',
        iconVisibility: 'focused-content',
        hideIconButton: true,
        iconInfo: 'coronita:info',
        tagComponent: '',
        value: '',
        invalid: 'invalidPan',
        type: 'text',
        allowedChars: '^\\d$'
      } ]);
      this.set('_accessKeyComponentsPropertiesQr', []);
      this._fireEvent('send-qr-page-remembered-user', this._dataNative);
      this._fireEvent('send-pan-property', this._accessKeyComponentsPropertiesPanQr);
    }
  }

  /**
   * Native response with QR URL given from native, will resolve if includes error or not
   * @param {Object} payload {error: false, qrString: 'string1234'}
   */
  nativeQrResponse(payload = {}) {
    this._urlQr = payload.qrString;
    if (Object.prototype.hasOwnProperty.call(payload, 'error')) {
      if (payload.error) {
        this._errorInvalidQr();
      } else {
        const encryptedCardNumber = (payload.qrString || '').substr(-4);
        this._fireEvent('send-encrypted-pan', encryptedCardNumber);
      }
    }
  }

  /**
   * Init method for key recovery password page set default values on UI component
   */
  initRecoveryPasswordPage() {
    this.checkModal = true;
    this.genericModalObj = {
      code: 'EDIT-CONFIRM',
      selectedConfig: {
        openMaximized: true,
        className: 'info header--white access-key-recovery-pass-modal close-button--right',
        title: 'cells-step-recovery-password-confirm-title',
        acceptBtLabel: 'cells-step-recovery-password-confirm-button',
        heroImage: Polymer.ResolveUrl.resolveUrl('images/lock_with_buttons.svg'),
        template: {
          type: 'paragraphs',
          values: [
            { text: 'cells-step-recovery-password-confirm-template-text'},
            { list: ['cells-step-recovery-password-confirm-template-list-first-value',
              'cells-step-recovery-password-confirm-template-list-second-value',
              'cells-step-recovery-password-confirm-template-list-third-value',
              'cells-step-recovery-password-confirm-template-list-fourth-value'],
            class: 'text-align-left'
            },
            {
              icon: 'coronita:info',
              class: 'spacing large-icon-akr',
              heading: 'cells-step-recovery-password-confirm-template-heading',
              message: 'cells-step-recovery-password-confirm-template-message',
              type: 'info-dark'
            }
          ]
        },
      }
    };
    this._fireEvent('open-password-info-modal', this.genericModalObj);
    this._fireEvent('request-new-iaas-ksjo-flag', {
      module: 'migracionIaasKSJO',
      feature: 'migracionIaasKSJO',
      user: this._user
    });
    this._setConfigData();
  }

  /**
   * set 'migracionIaasKSJO' feature locally in order to send
   * it with password recovery request body
   * @param {Object} payload
   */
  setIaasKsjoFlag(payload) {
    this.callNewKsjo = payload.isFlagEnable;
  }

  /**
   * Set default values and send data to UI component
   */
  _setConfigData() {
    const literal1 = /^[á-ü]/gm;
    const literal2 = /(.)\1{3}/gm;
    const literal3 = /bbva/gm;
    const literal4 = /^[0-9]{8,10}$/gm;
    const literal5 = /^[a-zA-Z]{8,10}$/gm;
    this.passwordMatchValidation = [literal1, literal2, literal3, literal4, literal5];
    let configObjectModal = this.genericModalObj;
    configObjectModal.selectedConfig.heroImage = '';
    this.set('passwordErrorTypes', [
      'cells-key-recovery-error-input-message-password-requirements',
      'cells-key-recovery-error-consecutive-chars',
      'cells-key-recovery-icon-message-error-bbva',
      'cells-key-recovery-error-input-message-password-numbers-requirements',
      'cells-key-recovery-error-input-message-password-numbers-requirements'
    ]);
    this._fireEvent('send-regex-match-config', this.passwordMatchValidation);
    this._fireEvent('send-regex-input-config', this.passwordInputValidationRegex);
    this._fireEvent('send-password-error-types', this.passwordErrorTypes);
    this._fireEvent('send-password-info-modal', configObjectModal);
  }

  /**
   * Sending to UI component PHONE-PAN properties
   */
  _setAccessKeyComponentsPropertiesPhonePan() {
    this._fireEvent('send-phone-pan', this._accessKeyComponentsPropertiesPhonePan);
  }

  /**
   * Sending to UI component CVV-NIP properties
   */
  _setAccessKeyComponentsPropertiesPinCvv() {
    if (this._isQrFlow) {
      this.set('_accessKeyComponentsPropertiesPinCvv', [
        {
          id: 'pin',
          cellsKeyRecoveryLoginInputPlaceholder: 'NIP',
          autofocus: 'autofocus',
          errorMessage: 'glomo-key-recovery-dm-properties-pin-message',
          errorMessageIcon: 'coronita:alert',
          maxLength: 4,
          toggleEmptyFillIcons: '',
          hideIconMessage: false,
          hideIconButton: true,
          iconMessage: 'glomo-key-recovery-dm-properties-pin-icon-message',
          iconInfo: 'coronita:info',
          tagComponent: 'cells-icon-message',
          iconAction: 'none',
          value: '',
          allowedDocumentValues: '^[0-9]{4,4}$',
          invalid: 'invalidPin',
          type: 'password',
          allowedChars: '^\\d$'
        }
      ]);
      this._fireEvent('send-landing-data', {user: this._user});
    } else {
      this.set('_accessKeyComponentsPropertiesPinCvv', [{
        id: 'cvv',
        cellsKeyRecoveryLoginInputPlaceholder: 'CVV',
        autofocus: 'autofocus',
        errorMessage: 'glomo-key-recovery-dm-properties-cvv-message',
        errorMessageIcon: 'coronita:alert',
        maxLength: 3,
        icon: 'coronita:close',
        iconLabel: 'icon-label-clear',
        iconAction: 'clear',
        iconEventAction: '',
        iconVisibility: 'focused-content',
        toggleEmptyFillIcons: '',
        hideIconMessage: false,
        hideIconButton: true,
        iconMessage: 'glomo-key-recovery-dm-properties-cvv-icon-message',
        iconInfo: 'coronita:info',
        tagComponent: 'div',
        value: '',
        allowedDocumentValues: '^[0-9]{3,3}$',
        invalid: 'invalidCvv',
        type: 'password',
        allowedChars: '^\\d$'
      },
      {
        id: 'pin',
        cellsKeyRecoveryLoginInputPlaceholder: 'NIP',
        autofocus: 'autofocus',
        errorMessage: 'glomo-key-recovery-dm-properties-pin-message',
        errorMessageIcon: 'coronita:alert',
        maxLength: 4,
        icon: 'coronita:close',
        iconLabel: 'icon-label-clear',
        iconAction: 'clear',
        iconEventAction: '',
        toggleEmptyFillIcons: '',
        hideIconMessage: false,
        iconVisibility: 'focused-content',
        hideIconButton: true,
        iconMessage: 'glomo-key-recovery-dm-properties-pin-icon-message',
        iconInfo: 'coronita:info',
        tagComponent: 'cells-icon-message',
        value: '',
        allowedDocumentValues: '^[0-9]{4,4}$',
        invalid: 'invalidPin',
        type: 'password',
        allowedChars: '^\\d$'
      }
      ]);
    }
    this._fireEvent('send-pin-cvv', this._accessKeyComponentsPropertiesPinCvv);
  }

  /**
   * Get from native if is a remembered user
   * Set self properties on accessKeyComponentsPropertiesPhonePan
   * @param {Obj} response
   */
  _isUserRemembered(response = {}) {
    if (this._isRememberedUser) {
      this.set('_accessKeyComponentsPropertiesPhonePan', [
        {
          id: 'pan',
          cellsKeyRecoveryLoginInputPlaceholder: 'glomo-form-text-input-input-place-holder-card',
          autofocus: 'autofocus',
          errorMessage: 'glomo-key-recovery-properties-pan-message',
          errorMessageIcon: 'coronita:alert',
          maxLength: 16,
          icon: 'coronita:camera',
          iconAction: 'event',
          iconEventAction: 'readCard',
          toggleEmptyFillIcons: 'toggle-empty-fill-icons',
          hideIconMessage: false,
          iconMessage: 'glomo-form-text-input-message-card-input',
          hideIconButton: true,
          iconInfo: 'coronita:info',
          tagComponent: 'div',
          value: '',
          iconVisibility: 'always',
          allowedDocumentValues: '[0-9]{16,16}',
          invalid: 'invalidPan',
          type: 'text',
          extraIcon: 'coronita:close',
          extraIconLabel: 'icon-label-clear',
          allowedChars: '^\\d$'
        }
      ]);
      this._user = response.user;
      this._fireEvent('send-remembered-user', {rememberedUser: true, user: this._user});
    } else {
      this.set('_accessKeyComponentsPropertiesPhonePan', [
        {
          id: 'user',
          autofocus: 'autofocus',
          cellsKeyRecoveryLoginInputPlaceholder: 'glomo-form-text-input-input-place-holder-phone',
          allowedDocumentValues: '^[0-9]{10,10}$',
          errorMessage: 'glomo-key-recovery-dm-properties-phone-message',
          errorMessageIcon: 'coronita:alert',
          maxLength: 10,
          icon: 'coronita:close',
          iconLabel: 'icon-label-clear',
          iconAction: 'clear',
          iconEventAction: '',
          toggleEmptyFillIcons: '',
          hideIconMessage: true,
          iconMessage: 'glomo-form-text-input-message-phone-input',
          iconVisibility: 'focused-content',
          hideIconButton: true,
          iconInfo: 'coronita:info',
          tagComponent: '',
          value: '',
          invalid: 'invalidPan',
          type: 'text',
          allowedChars: '^\\d$'
        },
        {
          id: 'pan',
          cellsKeyRecoveryLoginInputPlaceholder: 'glomo-form-text-input-input-place-holder-card',
          autofocus: 'autofocus',
          errorMessage: 'glomo-key-recovery-properties-pan-message',
          errorMessageIcon: 'coronita:alert',
          maxLength: 16,
          icon: 'coronita:camera',
          iconAction: 'event',
          iconEventAction: 'readCard',
          toggleEmptyFillIcons: 'toggle-empty-fill-icons',
          hideIconMessage: false,
          iconMessage: 'glomo-form-text-input-message-card-input',
          hideIconButton: false,
          iconInfo: 'coronita:info',
          tagComponent: 'div',
          value: '',
          iconVisibility: 'always',
          allowedDocumentValues: '[0-9]{16,16}',
          invalid: 'invalidPan',
          type: 'text',
          extraIcon: 'coronita:close',
          extraIconLabel: 'icon-label-clear',
          allowedChars: '^\\d$'
        }
      ]);
    }
    this._setAccessKeyComponentsPropertiesPhonePan();
  }

  /**
   * Sending a native flag read pan with camera plugin
   */
  sendCameraFlagToNative() {
    this._fireEvent('native-mobile-read-card', {touchCamera: true});
  }

  /**
   * Receive from native the card value
   */
  receiveNativeCard(response) {
    if (Object.keys(response).length !== 0) {
      this.set('_cardNumber', response);
      this._fireEvent('native-mobile-receive-card', this._cardNumber.pan);
    }
  }

  /**
   * Validation for send data to persist in qr flow
   * @param {Object} payload
   */
  sendQrToNipPage(payload = {}) {
    const detail = {
      user: payload.user,
      isQrFlow: this._isQrFlow,
      urlQr: this._urlQr,
      isLandingQr: this.isLandingQr,
      urlQrLanding: this.urlQrLanding
    };
    this._fireEvent('send-phone-qr', detail);
  }

  /**
   * Custom validation to dispatch event given a selected radio button config.
   */
  sendToRecoveryPage() {
    if (this._radioButtonselected !== -1) {
      const eventParam = this._radioButtonselected === 0 ? 'send-to-access-key-recovery-page' : 'send-to-access-key-qr-page';
      this.resetRadioButtons();
      this._fireEvent(eventParam, {rememberedUser: this._isRememberedUser, user: this._user, isQrFlow: this._radioButtonselected === 1, radioButton: this._radioButtonselected, isLandingQr: this.isLandingQr, dataPan: this.dataPan, urlQrLanding: this.urlQrLanding, checkModal: true});
      this._radioButtonselected = -1;
      this.isLandingQr = false;
    }
  }

  /**
   * Sending to native the objetc to get api request
   */
  sendValidateAccount(response) {
    if (response && Object.keys(response).length !== 0) {
      if (this._user === '') {
        this.set('_dataNative', response);
      } else {
        let result = {
          user: this._user,
          pan: response.pan
        };
        response = result;
        this.set('_dataNative', response);
      }
      this._openControlVeil();
      this.userAnonymous = this.consumerId;
    }
  }

  /**
   * Persist the data
   */
  dataPersist(eventParam) {
    const copyFromData = {...eventParam};
    this.set('_isRememberedUser', copyFromData.rememberedUser);
    this.set('_user', copyFromData.user);
    this.set('_isQrFlow', copyFromData.isQrFlow);
    this.set('_dataNative', this._extractQrProperty(copyFromData));
    this.set('_urlQr', copyFromData.urlQr);
    this.set('isLandingQr', copyFromData.isLandingQr);
    this.set('dataPan', copyFromData.dataPan);
    this.set('urlQrLanding', copyFromData.urlQrLanding);
    this.set('checkModal', copyFromData.checkModal);
  }

  /**
   * If contains isQrFlow unwanted property will be deleted
   * @param {Object} eventParam
   */
  _extractQrProperty(eventParam) {
    if (Object.prototype.hasOwnProperty.call(eventParam, 'isQrFlow') && !this.isLandingQr) {
      delete eventParam.isQrFlow;
    }
    return eventParam;
  }

  /**
   * Dispatch custom event to set CVV-NIP GT
   * @param {Obj} response
   */
  sendGrantingTicketCvvPin(response) {
    let result = {};
    this._openControlVeil();
    result = Object.assign(this._dataNative, response);
    if (response.pin && response.cvv) {
      this.pinCard = response.pin;
      this.getUnmaskedCVV(response.cvv);
    } else {
      this.getUnmaskedPin(response.pin);
    }
  }

  /**
   * Method to handle enable button validation according to date range
   * @param {Date} payload
   */
  obtainedDate(payload = {}) {
    this.set('_selectedDate', payload);
    let detail = {
      buttons: {
        primary: {
          text: 'glomo-key-recovery-dm-continue-button',
          action: 'new-password-created',
          disabled: true
        }
      }
    };
    if (this._selectedDate === null || this._selectedDate === '') {
      this._isInvalidForm(detail);
    } else {
      const minorDate = moment().subtract(120, 'years').format('YYYY-MM-DD');
      const maxDate = moment().format('YYYY-MM-DD');
      const valuedDate = !(moment(minorDate).isBefore(payload) && moment(maxDate).isAfter(payload));
      detail.buttons.primary.disabled = valuedDate;
      if (valuedDate) {
        this._isInvalidForm(detail);
      } else {
        this._fireEvent('access-key-enable-button-date', detail);
      }
    }
  }

  _isInvalidForm(payload) {
    this._fireEvent('access-key-enable-button-date', payload);
    this._fireEvent('access-key-reset-button-date', true);
  }

  /**
   * Dispatch custom event to set birthday GT
   */
  sendGrantingTicketBirthday() {
    let response = moment(this._selectedDate).format('yyyyMMDD');
    response = response.toString();
    let result = {
      user: this._dataNative.user,
      pan: this._dataNative.pan,
      birthday: response
    };
    this._openControlVeil();
    this._fireEvent('native-mobile-granting-ticket-birthday', result);
  }

  /**
   * Handling alerts with 409
   * @param {Object} errorCode
   */
  _handlingAlerts(errorCode) {
    if ([ 'MPE2941' ].includes(errorCode)) {
      this._usePhysicalCardError();
    } else if (['invalidCredentialsInternal', 'KZE1789'].includes(errorCode)) {
      this._invalidCredentialsInternal();
    }
  }

  /**
   * Get from native GT error and handle modal
   */
  receiveNativeGrantingTicketResponse(response) {
    this._closeControlVeil();
    if (Object.keys(response).length !== 0) {
      if (response.httpResponse === 200) {
        window.sessionStorage.setItem('tsec', response.tsec);
        this._channelStatus();
      } else if ([500, 600].includes(response.httpResponse)) {
        this._interrumpedConnectionModal();
      } else if ([400, 403, 409, 415].includes(response.httpResponse)) {
        this._wrongIdentyModalError();
      } else {
        this._genericError();
      }
    }
  }

  /**
   * Send to native input password
   * @param {Obj} response
   */
  sendPassword(response) {
    if (Object.keys(response).length !== 0) {
      let result = {
        originUserId: this._dataNative.user,
        passwordValue: response.newPassword,
        callNewKsjo: this.callNewKsjo
      };
      this._openControlVeil();
      this._fireEvent('access-key-password-reset', result);
      this._fireEvent('access-key-send-phone', result.originUserId);
    }
  }

  /**
   * @description Show modal when use card digital
   */
  _usePhysicalCardError() {
    const detail = {
      code: this.usePhysicalCardErrorCode,
      selectedConfig: {
        className: 'info header--white access-key-recovery-pass-modal close-button--right',
        openMaximized: true,
        iconOnlyFullHeight: true,
        title: 'glomo-digital-activation-dm-error-modal-header-title',
        acceptBtLabel: 'glomo-digital-activation-dm-understood-accept-label',
        heroImage: './images/error_TYC.svg',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-digital-activation-dm-paragraph-physical-card-title' },
            { text: 'glomo-digital-activation-dm-paragraph-physical-card-text' }
          ]
        }
      }
    };
    this._fireEvent(this.usePhysicalCardErrorEvent, detail);
  }

  /*
  * Method to validate output from the icon or from native android button
  */
  handleBackButton() {
    if (!this.checkModal) {
      this._dataExitModal();
    } else {
      this.checkModal = false;
      this._fireEvent('close-modal');
    }
  }

  /*
   * Fires when password modal is opened
   */
  openModalPassword() {
    this.checkModal = true;
  }

  /**
  * Advice modal opened yet for handleBackButton / data are received from close modal alert event
  */
  openModal(data) {
    if (!data) {
      this.checkModal = false;
    }
  }

  /**
   * Modal to Confirmation modal to exit
   */
  _dataExitModal() {
    this.checkModal = true;
    const eventParam = this.accessKeyHandleEvent;
    const alertCloseButton = {
      code: this.accessKeyHandleCode,
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'glomo-key-recovery-dm-exit-modal-accept-label',
        cancelBtLabel: 'glomo-key-recovery-dm-exit-modal-cancel-label',
        closeOnSecondaryButton: true,
        cancelFromHeaderEvent: undefined,
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert', class: 'spacing'},
            { text: 'glomo-key-recovery-dm-paragraph-exit-text' },
          ]
        }
      }
    };
    this._fireEvent(eventParam, alertCloseButton);
  }

  /**
   * Modal to show error on Qr native response
   */
  _errorInvalidQr() {
    this.checkModal = true;
    const detail = {
      code: 'ERROR-QR-MODAL',
      selectedConfig: {
        openMaximized: true,
        className: 'info header--white access-key-recovery-pass-modal close-button--right',
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        acceptBtLabel: 'alert-GENERIC-ERROR-retry',
        cancelBtLabel: 'alert-GENERIC-ERROR-exit',
        heroImage: './images/error_TYC.svg',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-error-qr-invalid-title' },
            { text: 'glomo-key-recovery-dm-error-qr-invalid-first-text' },
            { text: 'glomo-key-recovery-dm-error-qr-invalid-second-text' },
          ]
        },
      }
    };
    this._fireEvent('open-qr-error-modal', detail);
  }

  /**
   * Show modal on bloqued user by froud
   */
  _fraudBloquedUserModal() {
    this.checkModal = true;
    const pageOrigin = this.pageName;
    const eventOrigin = pageOrigin.toLowerCase();
    const errorDetail = {
      code: 'ERROR-FROUD-BLOQUED-USER-' + pageOrigin,
      selectedConfig: {
        openMaximized: true,
        className: 'info header--white icon-message-first close-button--right',
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        heroImage: './images/error_TYC.svg',
        acceptBtLabel: 'alert-GENERIC-ERROR-exit',
        closeOnPrimaryButton: true,
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-paragraph-bloqued-user-title' },
            { text: 'glomo-key-recovery-dm-paragraph-bloqued-user-first-text', class: 'spacing'},
            { text: 'glomo-key-recovery-dm-paragraph-bloqued-user-second-text' },
            { linkIcon: 'coronita:telephone',
              iconClass: 'icon-size-24',
              link: 'glomo-key-recovery-dm-call-line',
              eventName: 'key-recovery-show-call-line',
              class: 'below-paragraph'}
          ]
        }
      }};
    this._fireEvent('key-recovery-error-froud-bloqued-user-event-' + eventOrigin, errorDetail);
  }

  /**
   * Show modal on nip bloqued from ATM
   */
  _userNIPBloqued() {
    this.checkModal = true;
    const pageOrigin = this.pageName;
    const eventOrigin = pageOrigin.toLowerCase();
    const errorDetail = {
      code: 'ERROR-NIP-BLOQUED-USER-' + pageOrigin,
      selectedConfig: {
        openMaximized: true,
        className: 'info header--white icon-message-first close-button--right',
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        heroImage: './images/error_TYC.svg',
        acceptBtLabel: 'alert-GENERIC-ERROR-exit',
        closeOnPrimaryButton: true,
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-paragraph-bloqued-nip-user-title' },
            { text: 'glomo-key-recovery-dm-paragraph-bloqued-nip-user-first-text', class: 'spacing'},
            { text: 'glomo-key-recovery-dm-paragraph-bloqued-nip-user-second-text' },
            { linkIcon: 'coronita:place',
              iconClass: 'icon-size-24',
              link: 'glomo-key-recovery-dm-near-office',
              eventName: 'key-recovery-show-near-branch-office',
              class: 'below-paragraph'}
          ]
        }
      }};
    this._fireEvent('key-recovery-user-nip-bloqued-' + eventOrigin, errorDetail);
  }


  /**
   * Generic error with call to linea BBVA
   */
  _genericError() {
    this.checkModal = true;
    const data = {
      code: this.accessKeyResetGenericErrorCode,
      selectedConfig: {
        openMaximized: true,
        className: 'info header--white icon-message-first close-button--right',
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        heroImage: './images/error_TYC.svg',
        acceptBtLabel: 'alert-GENERIC-ERROR-retry',
        cancelBtLabel: 'alert-GENERIC-ERROR-exit',
        closeOnPrimaryButton: true,
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-paragraph-error-title' },
            { text: 'glomo-key-recovery-dm-paragraph-error-template-first-text' },
            { text: 'glomo-key-recovery-dm-paragraph-error-template-second-text' },
            { text: 'glomo-key-recovery-dm-paragraph-error-template-third-text' },
            { linkIcon: 'coronita:telephone',
              iconClass: 'icon-size-24',
              link: 'glomo-key-recovery-dm-call-line',
              eventName: 'key-recovery-show-call-line'}
          ]
        }
      }};
    this._fireEvent(this.accessKeyGenericErrorEvent, data);
  }

  /**
   * Show modal on connection error in native response
   */
  _interrumpedConnectionModal() {
    this.checkModal = true;
    let eventParam = this.interrumpedConnectionEvent;
    let data = {
      code: this.interrumpedConnectionCode,
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        cancelFromHeaderEvent: undefined,
        closeOnPrimaryButton: true,
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert'},
            { title: 'glomo-key-recovery-dm-paragraph-interrumped-connection-title' },
            { text: 'glomo-key-recovery-dm-paragraph-interrumped-connection-text', class: 'spacing'}
          ]
        }
      }};
    if (this.interrumpedConnectionNumberTries < this.interrumpedConnectionMaxTry) {
      this.interrumpedConnectionNumberTries += 1;
      data.selectedConfig.acceptBtLabel = 'glomo-key-recovery-dm-interrumped-retry-button';
    } else {
      this.interrumpedConnectionNumberTries = 0;
      eventParam = this.interrumpedConnectionMaxEvent;
      data.code = this.interrumpedConnectionMaxCode;
      data.selectedConfig.acceptBtLabel = 'glomo-key-recovery-dm-interrumped-max-retries-button';
      data.selectedConfig.template.values.pop();
      data.selectedConfig.template.values.push({ text: 'glomo-key-recovery-dm-paragraph-interrumped-connection-no-retry-text'});
    }
    this._fireEvent(eventParam, data);
  }

  /**
   * Modal to show error modal same password as before
   */
  _genericWrongPasswordModal() {
    this.checkModal = true;
    const detail = {
      code: 'GENERIC-KEY-RECOVERY-WRONG-PASSWORD',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'glomo-key-recovery-dm-error-password-accept-button',
        closeOnPrimaryButton: true,
        cancelFromHeaderEvent: undefined,
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert'},
            { text: 'glomo-key-recovery-dm-paragraph-error-text-password' }
          ]
        }
      }
    };
    this._fireEvent('key-recovery-open-generic-wrong-password', detail);
  }

  /**
   * Show modal on wrong identy error
   */
  _wrongIdentyModalError() {
    this.checkModal = true;
    const pageOrigin = this.pageName;
    const eventOrigin = pageOrigin.toLowerCase();
    if (this.countIdentyError < this.maxCountIdentyError) {
      this.countIdentyError += 1;
      const errorDetail = {
        code: 'ERROR-IDENTY-MODAL-' + pageOrigin,
        selectedConfig: {
          openMaximized: true,
          className: 'info header--white icon-message-first close-button--right',
          title: 'glomo-key-recovery-dm-error-modal-header-title',
          heroImage: './images/error_TYC.svg',
          acceptBtLabel: 'glomo-key-recovery-dm-error-modal-btn-label',
          closeOnPrimaryButton: true,
          template: {
            type: 'paragraphs',
            values: [
              { title: 'glomo-key-recovery-dm-paragraph-wrong-identy-error-title' },
              { text: 'glomo-key-recovery-dm-paragraph-wrong-identy-error-text', class: 'spacing'},
            ]
          }
        }};
      this._fireEvent('key-recovery-error-identy-modal-' + eventOrigin, errorDetail);
    } else {
      this._maxTriesIdentyModalError();
    }
  }

  /**
   * Show modal on wrong identy error no retries
   */
  _maxTriesIdentyModalError() {
    this.checkModal = true;
    const pageOrigin = this.pageName;
    const eventOrigin = pageOrigin.toLowerCase();
    this.countIdentyError = 0;
    const errorDetail = {
      code: 'ERROR-IDENY-MODAL-MAX-TRIES-' + pageOrigin,
      selectedConfig: {
        openMaximized: true,
        className: 'info header--white icon-message-first close-button--right',
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        heroImage: './images/error_TYC.svg',
        acceptBtLabel: 'alert-GENERIC-ERROR-exit',
        closeOnPrimaryButton: true,
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-paragraph-wrong-identy-error-title' },
            { text: 'glomo-key-recovery-dm-paragraph-max-tries-error-template-first-text'},
          ],
        },
        hasMultipleRedirectLink: {
          values: [
            { linkIcon: 'coronita:telephone',
              iconClass: 'icon-size-24',
              link: 'glomo-key-recovery-dm-call-line',
              eventName: 'key-recovery-show-call-line',
              class: 'below-paragraph'
            },
            { linkIcon: 'coronita:place',
              iconClass: 'icon-size-24',
              link: 'glomo-key-recovery-dm-near-office',
              eventName: 'key-recovery-show-near-branch-office',
              class: 'below-paragraph'
            }
          ]
        }
      }};
    this._fireEvent('key-recovery-max-tries-error-identy-modal-' + eventOrigin, errorDetail);
  }

  /**
   * Show modal for invalid Credentials
   */
  _invalidCredentialsInternal() {
    this.checkModal = true;
    const data = {
      code: this.accessKeyInvalidCredentialsInternalCode,
      selectedConfig: {
        openMaximized: true,
        className: 'info header--white icon-message-first close-button--right',
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        heroImage: './images/error_TYC.svg',
        acceptBtLabel: 'alert-INVALID-retry',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-credential-title' },
            { text: 'glomo-key-recovery-dm-redential-text' }
          ]
        }
      }};
    this._fireEvent(this.accessKeyInvalidCredentialsInternalEvent, data);
  }

  /**
  * @description Show modal when use diferent card
  */
  _accesKeyRecoveryAdditional() {
    this.checkModal = true;
    const detail = {
      code: 'KEY-RECOVERY-ADDITIONAL',
      selectedConfig: {
        className: 'info header--white close-button--right',
        openMaximized: true,
        iconOnlyFullHeight: true,
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        acceptBtLabel: 'glomo-key-recovery-dm-understood-accept-label',
        heroImage: './images/error_TYC.svg',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-additional-title' },
            { text: 'glomo-key-recovery-dm-additional-text' }
          ]
        }
      }
    };
    this._fireEvent('access-key-recovery-show-modal-additional', detail);
  }

  /**
  * @description Show modal when error is undefined
  */
  _accesKeyInvalidCardError() {
    this.checkModal = true;
    const detail = {
      code: 'KEY-RECOVERY-INVALID-CARD-ERROR',
      selectedConfig: {
        className: 'info header--white close-button--right',
        openMaximized: true,
        iconOnlyFullHeight: true,
        title: 'glomo-key-recovery-dm-error-modal-header-title',
        acceptBtLabel: 'glomo-key-recovery-dm-understood-accept-label',
        heroImage: './images/error_TYC.svg',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-key-recovery-dm-invalid-card-error-title' },
            { text: 'glomo-key-recovery-dm-invalid-card-error-text', class: 'spacing normal'},
            { text: 'glomo-key-recovery-dm-invalid-card-error-second-text' },
            {
              linkIcon: 'coronita:telephone',
              iconClass: 'icon-size-24',
              link: 'glomo-key-recovery-dm-call-line',
              eventName: 'key-recovery-show-call-line'
            }
          ]
        }
      }
    };
    this._fireEvent('access-key-recovery-show-modal-error', detail);
  }

  /**
   * Reset user properties and go back to native
   */
  resetAll(data) {
    if (this.isLandingQr) {
      this.resetLandingQr();
    }
    if (data) {
      this._openControlVeil();
    }
    this._resetDataManager();
    this.backToLogin();
    this._closeControlVeil();
  }

  /**
   * Set to defaul user properties
   */
  _resetDataManager() {
    this._user = '';
    this._cardNumber = '';
    this._authenticationType = '';
    this.dataPan = '';
    this._isRememberedUser = false;
    this._isQrFlow = false;
    this.isLandingQr = false;
    this.set('actualDate', {});
    this.resetPage();
    this.checkModal = false;
    this._dataNative = '';
  }

  /**
   * Dispatch custom event to send flag for reset to UI component
   */
  resetPage() {
    this._dataNative.checkModal = true;
    this._fireEvent(this.accessKeyResetEvent);
  }

  /**
   * Reset and close landing Qr
   */
  resetLandingQr() {
    this._fireEvent('reset-landing-qr-reader-page');
  }

  /**
   * Reset Register User
   */
  resetRegisterUser() {
    this._fireEvent('reset-register-user');
  }

  /**
   * Opens control veil
   */
  _openControlVeil() {
    this._fireEvent('open-control-veil');
  }

  /**
   * Closes control veil
   */
  _closeControlVeil() {
    this._fireEvent('close-control-veil');
  }

  /**
   * Dispatch custom event to handle back to native
   */
  backToLogin() {
    this._fireEvent(this.accessKeyLoginEvent);
  }

  /**
   *****************************************************************
   *                                                               *
   *                       Global migration                        *
   *                                                               *
   * ***************************************************************
   */


  /**
   *  Restart
   */
  reset() {
    this.newPassword = '';
    this.oldPassword = '';
    this.quality = '';
  }

  /**
   *  Modify password
   * @param {Object}
   */
  changePasswordRequest(payload) {
    this.oldPassword = payload.actualPassword || '';
    this.newPassword = payload.newPassword || '';
    const params = {
      userId: this.userId,
      oldPassword: this.oldPassword,
      newPassword: this.newPassword,
    };
    this._fireEvent('post-update-password', params);
  }

  /**
   *
   * Fires otp view event
   */
  fireOtpView() {
    this._fireEvent('otp-view');
  }

  /**
   * retry request change password
   */
  changePasswordRequestRetry() {
    const params = {
      userId: this.userId,
      oldPassword: this.oldPassword,
      newPassword: this.newPassword,
    };
    this._fireEvent('post-update-password', params);
  }

  /**
   *  Listener success-on-change-password
   */
  onModifyPasswordSuccess() {
    this._fireEvent('type-modal', 'success');
    this._fireEvent('message-content', this.t('cells-key-recovery-success-change'));
    this._fireEvent('icon-type', 'coronita:correct');
    this._fireEvent('modify-password-success', true);
    this._fireEvent('key-recovery-reset-password-success');
  }

  /**
   * set customer phone number
   */
  setCustomerPhoneNumber(detail) {
    this.userId = detail.userId ? detail.userId : '';
  }

  /**
   * set customer phone number in native
   */
  setNativePhoneNumber(phoneNumber) {
    this.userId = phoneNumber || '';
  }

  /* -------------------------------------------------------------------------- */
  /*                             Modal methods                                 */
  /* --------------------------------------------------------------------------*/

  /*
    * Check the error API and call the respective modal
  */
  checkErrorApi(payload) {
    let typeError = '';
    if (payload && Object.keys(payload).length) {
      typeError = payload?.messages[0]?.parameters[0]?.name;
    }
    switch (typeError) {
      /**
        *Contraseña actual incorrecta
        *Contraseñas iguales
      */
      case 'MDO_011':
      case 'MDO_017':
        this.errorModalHalf(typeError);
        break;
      /* Usuario bloqueado */
      case 'MDO_031':
        this.errorModalFull();
        break;
      /* Error generico */
      default:
        this.defaultModalError();
    }
  }

  /**
   * Half modal for errors in API about wrong current password and same password
  * */
  errorModalHalf(typeError) {
    const error = typeError === 'MDO_011' ? '-current-wrong' : '-same-password';
    const initConfig = {
      code: 'ERROR-CHANGE-PASSWORD',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: this.t('cells-key-recovery-error-modal-button-text-retry'),
        template: {
          type: 'paragraphs',
          values:
            [
              { icon: 'coronita:alert', iconClass: 'icon-size-24' },
              { text: this.t(`cells-key-recovery-error-modal-body-text${error}`) },
            ],
        },
      },
    };
    if (typeError === 'MDO_017') {
      this._fireEvent('key-recovery-same-password');
    }
    this._fireEvent('modify-password-error-request', initConfig);
  }

  /**
   * Full view modal error config
  * */
  errorModalFull() {
    const initConfig = {
      code: 'ERROR-PASSWORD-CHANGE',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'errorkeyUpdate',
        heroImage: './images/errors/error.svg',
        openMaximized: true,
        title: this.t('cells-key-recovery-error-blocked'),
        acceptBtLabel: this.t('cells-key-recovery-error-blocked-text'),
        cancelBtLabel: this.t('cells-key-recovery-error-blocked-button-call-line'),
        template: {
          type: 'paragraphs',
          values: [{
            title: this.t('cells-key-recovery-error-blocked'),
            class: 'simple-title',
          },
          {
            rawtext: this.t('cells-key-recovery-error-blocked-body-text'),
          }],
        },
      },
    };
    this._fireEvent('error-blocked-password-analytics');
    this._fireEvent('modify-password-error-request', initConfig);
  }

  /**
   * fires event to exit modal
   */
  exitModalChangePasswordAccepted() {
    this._fireEvent('exit-modal-accept');
  }

  /**
   * fires event to init modal closed
   */
  initModalClosed() {
    this._fireEvent('init-modal-closed');
  }

  /**
   * Default modal error when API doesn't have a identify error
   */
  defaultModalError() {
    const initConfig = {
      retryErrorData: {
        errorId: 'error-credential-otp',
        errorType: 'otherNotClasifiedErrors',
        retryConfig: {
          className: 'errorGenerickeyUpdate',
        },
      },
    };
    this._fireEvent('error-credentials', initConfig);
  }

  /**
   *  navigation to line bbva
   */
  callLineBbva() {
    this._fireEvent('call-bbva-line', { value: this.phone });
  }

  /**
   *  navigation to key recovery
   */
  navigationToAccessKey() {
    this._fireEvent('navigation-to-access-key-recovery');
  }

  /**
   * Listener error-on-change-password
   */
  exitModalChangePassword() {
    const initConfig = {
      code: 'EXIT-CANCEL-CHANGE-PASSWORD',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: this.t('cells-key-recovery-exit-modal'),
        cancelBtLabel: this.t('cells-key-recovery-exit-modal-continue'),
        template: {
          type: 'paragraphs',
          values:
            [
              { icon: 'coronita:alert', iconClass: 'icon-size-24' },
              { text: this.t('cells-key-recovery-exit-modal-body-text') },
            ],
        },
      },
    };
    this._fireEvent('exit-modal-analytics');
    this._fireEvent('modify-password-error-request', initConfig);
  }

  /**
   * Dispatch event with help modal config
   */
  openInfoModal() {
    this.modalConfig.selectedConfig.heroImage = '';
    const template = {
      type: 'paragraphs',
      values: [
        {
          title: 'cells-key-recovery-update-info-modal-title',
          icon: 'coronita:help',
          iconClass: 'icon-size-24',
          class: 'info text-center',
        },
        {
          list: [
            'cells-key-recovery-update-info-modal-list-item-1',
            'cells-key-recovery-update-info-modal-list-item-2',
            'cells-key-recovery-update-info-modal-list-item-3',
            'cells-key-recovery-update-info-modal-list-item-4',
          ],
          class: 'cells-lists-with-text-left',
        },
        {
          heading: 'cells-step-recovery-password-confirm-template-message-title',
          message: 'cells-key-recovery-update-info-modal-icon-message',
          icon: 'coronita:info',
          type: 'info',
        },
      ],
    };
    this.modalConfig.code = 'CELLS-KEY-RECOVERY-UPDATE-INFO';
    this.modalConfig.selectedConfig.template = template;
    this._fireEvent('open-modal', this.modalConfig);
  }

  /**
   * Dispatch event with init modal config
   */
  openInitModal() {
    const template = {
      type: 'paragraphs',
      values: [
        {
          title: 'cells-step-recovery-password-confirm-template-text-init',
          class: 'text-center',
        },
        {
          list: [
            'cells-key-recovery-update-info-modal-list-item-1',
            'cells-key-recovery-update-info-modal-list-item-2',
            'cells-key-recovery-update-info-modal-list-item-3',
            'cells-key-recovery-update-info-modal-list-item-4',
          ],
          class: 'cells-lists-with-text-left',
        },
        {
          heading: 'cells-step-recovery-password-confirm-template-message-title',
          message: 'cells-key-recovery-update-info-modal-icon-message',
          icon: 'coronita:info',
          type: 'info',
        },
      ],
    };
    this.modalConfig.code = 'CELLS-KEY-RECOVERY-UPDATE-INIT';
    this.modalConfig.selectedConfig.template = template;
    this.modalConfig.selectedConfig.heroImage = './images/lock_with_buttons.svg';
    this._fireEvent('open-modal', this.modalConfig);
  }

  /**
   * @param {Object} payload
   * is parsed finding errors and create new object to give
   * information about new password
   */

  validationEsfInfo(payload) {
    const { errors } = payload;
    const specialErrors = {
      'esf-pass-checker-require-length': 'minimumLength',
      'esf-pass-checker-limit-consecutive-char': 'consecutiveChars',
      'esf-pass-checker-limit-identical-char': 'identicalChars',
    };

    const flagsErrors = Object.keys(specialErrors).reduce((acc, errorFund) => {
      let accumulator = acc;
      if (Object.keys(errors).includes(errorFund)) {
        accumulator = [...accumulator, specialErrors[errorFund]];
      }
      return accumulator;
    }, []);

    const validationInfo = {
      isValid: payload.isValid,
      level: payload.localized_quality,
      class: this._checkQualityPassword(payload.quality),
      flagsErrors,
    };
    this._fireEvent('validation-information-parsed', validationInfo);
  }

  /**
   * check quality password and return string value
   */
  _checkQualityPassword(quality) {
    this.quality = quality;
    switch (this.quality) {
      case 1:
        return 'low';
      case 2:
        return 'medium';
      case 3:
        return 'high';
      default:
        return '';
    }
  }

}

customElements.define(GlomoKeyRecoveryMxDm.is, GlomoKeyRecoveryMxDm);
