window.CellsBehaviors = window.CellsBehaviors || {};

window.CellsBehaviors.pageStEnrollmentMixinMx = superClass => class extends superClass {
  static get properties() {
    return {
      /**
       * String property that reprents the current id
       * for the user's device.
       * @String
       */
      deviceId: {
        type: String,
        value: ''
      },
      /**
       * This property represents a function callback for
       * successfull response.
       * @Function
       */
      stEtherTokenResolve: {
        type: Function,
        value: null
      },
      /**
       * This property represents a function callback for
       * unsuccessfull response.
       * @Function
       */
      stEtherTokenReject: {
        type: Function,
        value: null
      }
    };
  }

  /**
   * Verifies if no tokens (S2, S3, or Cronto) are present or if multiple tokens exist to display stEnrollment.
   * Otherwise, if a single token (S2, S3, or Cronto) is present, it displays stBackgroundEnrollment.
   *
   * Triggers an event to share a tokenList when the selected landing is stBackgroundEnrollment.
   * @event st-token-enrollment
   */
  async _stEnrollmentPageReady() {
    const tokenS2 = await this.$.pluginSofttoken.getTokenList('TOTP').catch(() => ({array: []}));
    const tokenS3 = await this._initEtherTokenPromise().catch(() => []);
    const tokenCronto = await this.generateOtp().catch(() => false);

    const tokenList = [
      { type: 'tokenS2', tokenS2, hasToken: !!tokenS2.array?.length, size: tokenS2.array?.length },
      { type: 'tokenS3', tokenS3, hasToken: !!tokenS3.length, size: tokenS3.length },
      { type: 'tokenCronto', tokenCronto, hasToken: tokenCronto, size: tokenCronto ? 1 : 0 }
    ];

    let maxSerials = 0;
    let totalFoundActiveTokens = 0;

    tokenList.forEach(token => token.size >= 1 && (totalFoundActiveTokens++, maxSerials = token.size));

    const isStEnrollment = (totalFoundActiveTokens > 1 || totalFoundActiveTokens === 1 && maxSerials > 1 || maxSerials === 0);
    const isStBackground = !isStEnrollment;

    const enrol = isStEnrollment ? 'stEnrollment' : 'stBackgroundEnrollment';
    const ready = isStEnrollment || isStBackground;

    this.__fireEvent('st-token-enrollment', tokenList);

    return {
      ready,
      page: enrol
    };
  }

  /**
   * Initializes a Promise to handle callbacks for Token S3.
   *
   * Event to initialize the Ether plugin.
   * @event st-enrollment-mx-get-tokens-ids
   */
  _initEtherTokenPromise() {
    this.__fireEvent('st-enrollment-mx-get-tokens-ids');
    return new Promise((resolve, reject) => {
      this.stEtherTokenResolve = resolve;
      this.stEtherTokenReject = reject;
    });
  }

  /**
   * This method handles a successful response when the Token S3 is called.
   * @param {Array} detail
   */
  getAllEtherTokenIdsSuccess(detail) {
    if (this.stEtherTokenResolve) {
      this.stEtherTokenResolve(detail);
      this.stEtherTokenResolve = null;
    }
  }

  /**
   * This method handles an unsuccessful response when the Token S3 is called.
   */
  getAllEtherTokenIdsError() {
    if (this.stEtherTokenReject) {
      this.stEtherTokenReject([]);
      this.stEtherTokenReject = null;
    }
  }

  /**
   * Generate OTP Cronto
   */
  async generateOtp() {
    const params = {
      deviceId: this.deviceId,
      challenge: ''
    };
    return await this.$.tokenCrontoPlugin.generateOtp(params);
  }
};
