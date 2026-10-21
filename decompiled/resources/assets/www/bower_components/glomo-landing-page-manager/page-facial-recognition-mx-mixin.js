/*global moment */
/*eslint "no-shadow": [2, { "hoist": "functions" }]*/

window.CellsBehaviors = window.CellsBehaviors || {};

window.CellsBehaviors.facialRecognitionMixinMx = superClass => class extends superClass {
  static get properties() {
    return {
      /**
      * assing detail customers
      */
      customers: {
        type: Object
      },
      /**
      * assing detail biometrics
      */
      biometrics: {
        type: Object
      },
      /**
      * assing statusBiometrics
      */
      statusBiometrics: {
        type: Array,
        value: () => []
      },
      /**
      * assing code in statusBiometrics
      */
      statusBiometricsCode: {
        type: String
      },
      /**
       * @property {Function} _getBiometricsDataResolve - This property is a function that is used as the resolve function
       * for the Promise in the __getBiometricsData method. It is initially undefined and is assigned when the Promise is created.
       */
      _getBiometricsDataResolve: {
        type: Function
      },
      /**
       * @property {Function} _getBiometricsDataReject - This property is a function that is used as the reject function
       * for the Promise in the __getBiometricsData method. It is initially undefined and is assigned when the Promise is created.
       */
      _getBiometricsDataReject: {
        type: Function
      },
      /**
       * @type {Boolean}
       * determine if listBiometrics is off
       */
      _biometricsOn: {
        type: Boolean,
        value: true
      },
      /**
       * @type {String}
       * @description Key to get the value of the biometricFlag
       */
      keyBiometricFlag: { type: String },
      /**
       * @type {String}
       * This property is used as a key to access biometric data from local storage.
       * It is initialized with the string 'accessBiometricStorage'.
       */
      _accessBiometricStorage: {
        type: String,
        value: 'accessBiometricStorage'
      }
    };
  }

  static get observers() {
    return [
      '_getFinancialOverviewResponse(value)'
    ];
  }

  /**
   * Get if the detail customers
   */
  setDetailCustomer(params) {
    this.customers = params;
  }

  /**
   * This method determines the readiness of the facial recognition page based on the biometric enrollment status.
   * It performs the following steps:
   * 1. Retrieves the biometric status from local storage.
   * 2. If statusBiometric is '002', it sets the show variable to false.
   * 3. If statusBiometric is not '002' and biometrics are enabled, it validates the list of biometrics and sets the show variable to the result.
   * 4. If statusBiometric is not '002' and biometrics are not enabled, it sets the show variable to false.
   * 5. Finally, it returns an object with a 'ready' property indicating the readiness of the facial recognition page.
   * @returns {Promise<Object>} - A promise that resolves to an object with a 'ready' property indicating the readiness of the facial recognition page.
   * If the page is ready, the object also includes a 'page' property with the value 'facialRecognition'.
   */
  async _facialRecognitionPageReady() {
    let show = true;
    const statusBiometric = (await this._getFromLocalStorage(this._accessBiometricStorage, true))?.statusBiometric;
    if (statusBiometric) {
      this.__fireEvent('send-code-list-biometrics', statusBiometric);
    }
    if (statusBiometric === '002') {
      show = false;
    } else {
      if (this._biometricsOn) {
        show = await this._validateListBiometrics();
      } else {
        show = false;
      }
    }
    let ready  = {ready: show};
    if (show) {
      ready.page = 'facialRecognition';
    }
    return ready;
  }

  /**
   * This method validates if the biometric enrollment is active in ListBiometrics.
   * @returns {boolean} - Returns true if the statusBiometricsCode is '000' or '004',
   * false if the biometrics is null or if the statusBiometricsCode is not '000' or '004'.
  */
  async _validateListBiometrics() {
    let showError = true;
    this.biometrics = await this.__setListBiometrics(this.customers).catch(
      (err) => {
        const { status } = err;
        if (status >= 500) {
          showError = false;
        }
        return null;
      }
    );
    if (!this.biometrics) {
      if (showError) {
        this.__fireEvent('alert-error-list-biometrics');
        return true;
      }
      return false;
    }
    this._convertBiometricsCode();
    const isCodeEnrollment = this.statusBiometricsCode === '000';
    const isCodeBlocked = this.statusBiometricsCode === '004';
    return isCodeEnrollment || isCodeBlocked;
  }

  /**
   * This method is used to handle the successful response of the biometrics data request.
   * If the _getBiometricsDataResolve property is defined, it calls this function with the response value and then clears the promise callbacks.
   *
   * @param {Object} value - The response value from the 'get-list-biometrics' event.
   */
  getBiometricsDataResponse(value) {
    /* istanbul ignore else */
    if (this._getBiometricsDataResolve) {
      this._getBiometricsDataResolve(value);
      this._clearPromiseCallbacks();
    }
  }

  /**
   * This method is used to handle the error response of the biometrics data request.
   * If the _getBiometricsDataReject property is defined, it calls this function with the error and then clears the promise callbacks.
   *
   * @param {Object} e - The error from the 'get-list-biometrics' event.
   */
  getBiometricsDataResponseError(e) {
    /* istanbul ignore else */
    if (this._getBiometricsDataReject) {
      this._getBiometricsDataReject(e);
      this._clearPromiseCallbacks();
    }
  }

  /**
   * This method is used to get biometrics data.
   * It returns a new Promise that resolves or rejects based on the result of the 'get-list-biometrics' event.
   * If the 'get-list-biometrics' event does not respond within 5000 milliseconds, the Promise is rejected with 'timeout'.
   * The resolve and reject functions of the Promise are stored in the _getBiometricsDataResolve and _getBiometricsDataReject properties respectively.
   * The 'get-list-biometrics' event is fired with the customer-id as a parameter.
   * @returns {Promise} - Returns a new Promise that resolves or rejects based on the result of the 'get-list-biometrics' event.
   */
  __setListBiometrics(params) {
    return new Promise((resolve, reject) => {
      this._getBiometricsDataResolve = resolve;
      this._getBiometricsDataReject = reject;
      this.__fireEvent('get-list-biometrics', {
        'customer-id': params.customerId,
      });
    });
  }

  /**
   * This method is used to clear the resolve and reject functions after the Promise is completed.
   */
  _clearPromiseCallbacks() {
    this._getBiometricsDataResolve = null;
    this._getBiometricsDataReject = null;
  }

  /**
   * This method is used to convert the biometrics code if the biometric enrollment is active in the ListBiometrics.
   */
  _convertBiometricsCode() {
    if (!Array.isArray(this.biometrics)) {
      return;
    }
    const facialBiometric = this.biometrics?.find(el => el.biometricType.id === 'FACIAL');
    const statusBiometric = this.statusBiometrics?.find(status => status.id === facialBiometric?.status?.id);

    if (statusBiometric?.code) {
      this.statusBiometricsCode = statusBiometric.code;
      this.sendCodeListBiometric(this.statusBiometricsCode);
    }
  }

  /**
   * Validates whether the flag is active or not to send listBiometrics.
   * @param {Object} featureFlagCollection - The feature flag collection.
   * If null or undefined, it defaults to an empty object.
   */
  getFeatureFlags(featureFlagCollection) {
    const flagCollection = featureFlagCollection ?? {};
    this._biometricsOn = flagCollection[this.keyBiometricFlag]?.value ?? true;
  }

  /**
   * This function sends the status code from the "listBiometrics" service and stores it in local storage.
   * First, it stores the status code in local storage under the key defined by the `_accessBiometricStorage` property.
   * Then, it fires a 'send-code-list-biometrics' event with the status code as the event detail.
   * @param {string} code - The status code from the "listBiometrics" service.
   * @fires 'send-code-list-biometrics' - The event fired with the status code as the event detail.
   * @returns {Promise} - Returns a promise that resolves when the status code has been successfully stored in local storage.
   */
  async sendCodeListBiometric(code) {
    this.__fireEvent('send-code-list-biometrics', code);
    await this._setToLocalStorage(this._accessBiometricStorage, { statusBiometric: code }, true);
  }
};