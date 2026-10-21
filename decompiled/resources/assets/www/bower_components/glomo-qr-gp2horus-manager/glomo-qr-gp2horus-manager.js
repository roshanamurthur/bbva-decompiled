/**
 *`<glomo-qr-gp2horus-manager>` Manage selected tab to show content in Glomo qr reader.
 *
 * Manage camera permission flow and server calls to navigate a destination page indicated on serve response.
 *
 * ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)
 * Example:
 * ```html
 * <glomo-qr-gp2horus-manager></glomo-qr-gp2horus-manager>
 * ```
 *
 * ## Important
 *
 * If you want to process QR and obtain redirect response correctly from server you must set `source` property with defined possibilities.
 *
 * It can be done through **channels** or by **shared params** between pages.
 *
 * ## Public methods
 *
 * - `init()`\
 * Manager method to check initialization of permission required to use components
 *
 * - `reset()`\
 * Reset properties
 *
 * - `qrFromGallery(qrContent)`\
 * Handle QR from gallery
 *
 * - `getQRURL(qrContent)`\
 * Process QR content
 *
 * - `saveQrCodeRead(payload)`\
 * Save QR read
 *
 * @customElement
 * @polymer
 * @extends {Polymer.Element}
 * @demo demo/index.html
 */
class GlomoQrGp2horusManager extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior, CellsBehaviors.CellsCheckNestedKeysBehavior
], Polymer.Element) {
  static get is() {
    return 'glomo-qr-gp2horus-manager';
  }

  static get properties() {
    return {
      /**
       * Indicates if environment is mobile
       * @type {Boolean}
       * @default false
       */
      isNative: {
        type: Boolean,
        value: false
      },
      /**
       * Country of manager
       * @type {String}
       */
      country: {
        type: String,
      },
      /**
       * Host
       * @type {String}
       */
      host: String,
      /**
       * Source by manager
       * @type {String}
       */
      source: {
        type: String
      },
      /**
       * Part of key used to sign server petition
       * @type {String}
       */
      complementaryKey: {
        type: String
      },
      /**
       * Secret key used to sign server petition
       * @type {String}
       */
      secretKeys: {
        type: String
      },
      /**
       * Flag to know if keys are set
       * @type {Boolean}
       */
      keysSet: {
        type: Boolean,
        value: false
      },
      /**
       * QR code
       * @type {String}
       */
      _qrCode: {
        type: String
      },
      /**
       * URL base 64
       * @type {String}
       */
      _urlB64: {
        type: String
      },
      /**
       * Page where component is allocated
       * @type {String}
       */
      page: {
        type: String
      },
      /**
       * Flag to know if QR is from gallery
       * @type {Boolean}
       */
      isQRFromGallery: {
        type: Boolean,
        value: false
      },
      /**
       * Generic error
       * @type {Object}
       */
      genericError: {
        type: Object,
        value: () => ({})
      },
      /**
       * Generic error from camera
       * @type {Object}
       */
      genericErrorFromCamera: {
        type: Object,
        value: () => ({})
      },
      /**
       * local storage data key
       * @type {String}
       */
      localStorageDataKey: {
        type: String
      },
      /**
       * Flag to know if onboarding is visible or not
       * @type {Boolean}
       */
      _onboardingVisible: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Return value of _qrCode
   * @return {String}
   */
  get qrCode() {
    return this._qrCode;
  }

  /**
   * Return value of _urlB64
   * @return {String}
   */
  get urlB64() {
    return this._urlB64;
  }

  /**
   * Initialization, setup key if need it
   */
  init() {
    if (!this.keysSet) {
      this.$.hmac.setupKey(this.secretKeys, this.complementaryKey);
      this.keysSet = true;
    }
    if (this.localStorageDataKey) {
      this._fireEvent('get-qr-acces-visited-local-storage-data', { key: this.localStorageDataKey });
    }
  }

  /**
   * Reset
   */
  reset() {
    this._qrCode = null;
    this._urlB64 = null;
    this.isQRFromGallery = false;
    this._onboardingVisible = false;
  }

  /**
   * Setup sign key from app-settings
   *
   * @param {Object} dataAppSettings
   */
  setupKey(dataAppSettings) {
    this.secretKeys = dataAppSettings.secretKeys.qr;
  }

  /**
   * Process QR from gallery
   *
   * @param {Object} qrContent
   */
  qrFromGallery(qrContent) {
    this.isQRFromGallery = true;
    this.getQRURL(qrContent);
  }

  /**
   * Process QR content
   *
   * @param {Object} qrContent
   */
  getQRURL(qrContent) {
    this.saveQrCodeRead(qrContent);
    this._urlB64 = this._utf8toB64(this._qrCode);
    this._generateDigitalSign();
  }

  /**
   * Save QR read
   *
   * @param {Object}
   * @event glomo-qr-gp2horus-manager-code-process
   */
  saveQrCodeRead(payload = {}) {
    this._qrCode = payload.content || payload.friendlycontent;
    this._fireEvent('glomo-qr-gp2horus-manager-code-process', this._qrCode);
  }

  /**
   * Close modals and exit operatives
   * @event close-error-modals
   * @event exit-qr-scanner
   */
  exitQrScanner(ev) {
    if (!ev || this.page === this.c(ev, 'value.cancelledNavigation.currentPage')) {
      if (!this._onboardingVisible) {
        this._fireEvent('close-error-modals', true);
        this._fireEvent('exit-qr-scanner', true);
      } else {
        this._changeOnboardingVisibility(false);
        this._openQRScanner();
      }
    }
  }

  /**
   * Manage get local storage success
   * @param {Object}
   */
  getLocalStorageSuccess(data) {
    if (!this.c(data, 'visited', false)) {
      this._openWelcomeModal();
    } else {
      this._openQRScanner();
    }
  }

  /**
   * Manage get local storage error.
   * On iOS if you try to read a key that it does not exist will return an error
   */
  getLocalStorageError() {
    this._openWelcomeModal();
  }

  /**
   * launch events to save first acces on local storage and open first time access welcome modal
   * @event set-qr-acces-visited-local-storage-data
   * @event set-qr-scanner-first-access-welcome-modal-fragment-host
   * @event set-qr-scanner-first-access-welcome-modal-fragment-path
   */
  _openWelcomeModal() {
    this._fireEvent('set-qr-acces-visited-local-storage-data', { key: this.localStorageDataKey, value: { visited: true } });
    this._fireEvent('set-qr-scanner-first-access-welcome-modal-fragment-host', this.contentFragmentHost);
    this._fireEvent('set-qr-scanner-first-access-welcome-modal-fragment-path', this.contentFragmentPath);
    this._changeOnboardingVisibility(true);
  }

  /**
   * Manage onboarding visibility
   * @param {Object}
   */
  manageOnboardingVisibility(visibility) {
    this._onboardingVisible =  this.c(visibility, 'visible', false);
  }

  /**
   * Manage get local storage success
   * @event open-qr-scanner
   */
  _openQRScanner() {
    this._fireEvent('open-qr-scanner');
  }

  /**
   * Manage get local storage success
   * @event open-qr-scanner-first-access-welcome-modal
   * @param {Boolean}
   */
  _changeOnboardingVisibility(visible) {
    this._fireEvent('open-qr-scanner-first-access-welcome-modal', visible);
  }

  /**
   * Handler to transform string type to Base64Url
   *
   * @param {String} url
   * @returns {String} base64Url string
   */
  _utf8toB64(str) {
    return window.btoa(encodeURIComponent(str).replace(/%([0-9A-F]{2})/g, function(match, p1) {
      return String.fromCharCode('0x' + p1);
    }));
  }

  /**
   * Generate fist chain (Country + QR(b64) + Source) and send it to HMAC
   */
  _generateDigitalSign() {
    const chain = `country~${this.country}#qr~${this._urlB64}#source~${this.source}`;
    this.$.hmac.encryptString(chain, 'base64');
  }

  /**
   * Receives error modal configuration and fires an event with config
   *
   * @param {Object} config
   *
   * @event glomo-qr-gp2horus-manager-show-error
   */
  _fireErrorModal(config) {
    this._fireEvent('glomo-qr-gp2horus-manager-show-error', config);
  }

  /**
   * Handler request when response is an error
   * @event close-control-veil
   */
  _handleQRServerError() {

    this._fireErrorModal(this.isQRFromGallery ? this.genericError : this.genericErrorFromCamera);
    this._fireEvent('close-control-veil');
  }

  /**
   * Handler response from server
   * @event close-control-veil
   * @param {Object} response
   */
  _handleQRServerResponse(response) {
    const { detail: data } = response;
    if (data && data.resultCode === 'OK' && this._parseQRData(data.qr)) {
      this._fireEvent('qr-contained-data', {
        page: data.redirectTo,
        rawInfo: data.raw,
        qr: this._parseQRData(data.qr),
        qrType: data.qrType
      });
    } else {
      this._handleQRServerError(response);
    }
    this._fireEvent('close-control-veil');
  }

  /**
   * Reset Source to sidebar
   */
  resetSource() {
    this.source = 'sidebar';
  }

  /**
   * Parse qr data
   * @param {String} dataToParsed
   */
  _parseQRData(dataToParsed) {
    try {
      return decodeURIComponent(window.atob(dataToParsed).split('').map(c => {
        return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
      }).join(''));
    } catch {
      return null;
    }
  }

  /**
  * Receive fist chain from HMAC and do POST petition to server
  * @event open-control-veil
  * @param {Event} params
  */
  _receiveHMACRawArgument(params) {
    this._fireEvent('open-control-veil');
    this.$.dm.postQrData({
      qr: this._urlB64,
      country: this.country,
      source: this.source,
      raw: params.detail
    });
  }

  /**
  * Handle Sign Key error
  * @event close-control-veil
  * @param {Event} params
  */
  _receiveHMACRawError() {
    this._fireErrorModal(this.genericError);
    this._fireEvent('close-control-veil');
  }

  /**
   * Handler method to fire CustomEvent
   *
   * @param {String} eventName
   * @param {*} detail
   */
  _fireEvent(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, {
      detail: detail,
      bubbles: true,
      composed: true
    }));
  }
}

window.customElements.define(GlomoQrGp2horusManager.is, GlomoQrGp2horusManager);
